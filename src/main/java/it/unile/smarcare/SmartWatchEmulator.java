package it.unile.smarcare;

import it.unile.smarcare.model.SensorData;

public class SmartWatchEmulator {

    private int mesurementInterval = 500;

    private int MIN_BLOOD_PRESSURE_MIN_VALUE = 50;

    private int MIN_BLOOD_PRESSURE_MAX_VALUE = 150;

    private int MAX_BLOOD_PRESSURE_MIN_VALUE = 90;

    private int MAX_BLOOD_PRESSURE_MAX_VALUE = 200;

    private int PULSE_RATE_MIN_VALUE = 50;

    private int PULSE_RATE_MAX_VALUE = 200;

    private double TEMPERATURE_MIN_VALUE = 35.0;

    private double TEMPERATURE_MAX_VALUE = 42.0;

    private SmartEdgeDevice smartEdgeDevice;

    public SmartWatchEmulator(SmartEdgeDevice smartEdgeDevice) {
        this.smartEdgeDevice = smartEdgeDevice;
    }

    // Generate a class with a main method that generates a random number between 0 and 100 every 1 second
    public void start() {
        while (true) {
            // Create a random number between MIN_BLOOD_PRESSURE_MIN_VALUE and MIN_BLOOD_PRESSURE_MAX_VALUE
            int minBloodPressureValue = (int) (Math.random() * (MIN_BLOOD_PRESSURE_MAX_VALUE - MIN_BLOOD_PRESSURE_MIN_VALUE + 1) + MIN_BLOOD_PRESSURE_MIN_VALUE);
            // Create a random number between MAX_BLOOD_PRESSURE_MIN_VALUE and MAX_BLOOD_PRESSURE_MAX_VALUE
            int maxBloodPressureValue = (int) (Math.random() * (MAX_BLOOD_PRESSURE_MAX_VALUE - MAX_BLOOD_PRESSURE_MIN_VALUE + 1) + MAX_BLOOD_PRESSURE_MIN_VALUE);

            // Create a random number between PULSE_RATE_MIN_VALUE and PULSE_RATE_MAX_VALUE
            int pulseRateValue = (int) (Math.random() * (PULSE_RATE_MAX_VALUE - PULSE_RATE_MIN_VALUE + 1) + PULSE_RATE_MIN_VALUE);

            // Create a random number between TEMPERATURE_MIN_VALUE and TEMPERATURE_MAX_VALUE
            double temperatureValue = (double) (Math.random() * (TEMPERATURE_MAX_VALUE - TEMPERATURE_MIN_VALUE + 1) + TEMPERATURE_MIN_VALUE);

            SensorData sensorData = new SensorData(temperatureValue, pulseRateValue, minBloodPressureValue, maxBloodPressureValue);
            sendSensorData(sensorData);
            try {
                Thread.sleep(mesurementInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendSensorData(SensorData sensorData) {
        smartEdgeDevice.onReceiveSensorData(sensorData);
    }

}
