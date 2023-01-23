package it.unile.smarcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SmarcareApplication {

    private final Environment environment;

    public SmarcareApplication(Environment environment) {
        this.environment = environment;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SmarcareApplication.class, args);
        context.registerShutdownHook();
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doApplicationReady() {

        startSmartEdgeDevice();
    }

    private void startSmartEdgeDevice() {
        String orionURL = environment.getProperty("orion.server-url");
        SmartEdgeDevice smartEdgeDevice = new SmartEdgeDevice(orionURL);
        smartEdgeDevice.start();
    }
}
