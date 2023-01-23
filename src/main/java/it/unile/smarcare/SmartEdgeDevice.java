package it.unile.smarcare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;
import it.unile.smarcare.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SmartEdgeDevice {

    private static final Logger log = LoggerFactory.getLogger(SmartEdgeDevice.class);

    private static final int ORION_SEND_INTERVAL = 5000; //mando ad orion ogni 5s

    private List<SensorData> sensorDataList = new ArrayList<>();

    private int sensorDataCounter = 0;

    public void start() {
        SmartWatchEmulator smartWatchEmulator = new SmartWatchEmulator(this);
        // Execute the start method of the SmartWatchEmulator class in a separate thread
        new Thread(() -> smartWatchEmulator.start()).start();

        while (true) {
            try {
                String orionResponse = sendSensorDataToORION();
                log.info("  <---- ORION response: {}", orionResponse);

                Thread.sleep(ORION_SEND_INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onReceiveSensorData(SensorData sensorData) {
        log.info("Received sensor data: {}", sensorData);
        sensorDataList.add(sensorData);
    }

    public String sendSensorDataToORION() {
        if (sensorDataList.isEmpty()) {
            return "No sensor data to send";
        }

        SensorData sensorData = sensorDataList.get(sensorDataList.size() - 1);
        log.info("  ----> Sending sensor data to ORION: {}", sensorData);


        ObjectMapper objectMapper = new ObjectMapper();
        // Send the sensor data to fiware/orion
        SensorDataOrion sensorDataOrion = new SensorDataOrion(
                "sensor-" + sensorDataCounter++,
                "SmartWatch",
                new OrionAttributeTemperature(sensorData.getTemperature()),
                new OrionAttributeMaxBloodPressure(sensorData.getMaxBloodPressure()),
                new OrionAttributeMinBloodPressure(sensorData.getMinBloodPressure()),
                new OrionAttributePulseRate(sensorData.getPulseRate())

        );

        // Generate an http client
        OkHttpClient client = new OkHttpClient();
        String orionURL = "http://localhost:1026/v2/entities";

        try {
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), objectMapper.writeValueAsString(sensorDataOrion));
            Request request = new Request.Builder()
                    .url(orionURL)
                    .post(body)
                    .build();
            Response response = client.newCall(request).execute();
            return response.body().toString();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
