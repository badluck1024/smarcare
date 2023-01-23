package it.unile.smarcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmarcareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmarcareApplication.class, args); //avvia app
        startSmartEdgeDevice();
    }

    private static void startSmartEdgeDevice() {
        SmartEdgeDevice smartEdgeDevice = new SmartEdgeDevice(); //avvia device
        smartEdgeDevice.start();
    }
}
