package it.unile.smarcare.model;

public class SensorDataOrion {

    private String id;
    private String type;
    private OrionAttributeTemperature temperature;
    private OrionAttributeMaxBloodPressure maxPressure;
    private OrionAttributeMinBloodPressure minPressure;
    private OrionAttributePulseRate pulseRate;

    public SensorDataOrion(String id, String type, OrionAttributeTemperature temperature, OrionAttributeMaxBloodPressure maxPressure, OrionAttributeMinBloodPressure minPressure, OrionAttributePulseRate pulseRate) {
        this.id = id;
        this.type = type;
        this.temperature = temperature;
        this.maxPressure = maxPressure;
        this.minPressure = minPressure;
        this.pulseRate = pulseRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrionAttributeTemperature getTemperature() {
        return temperature;
    }

    public void setTemperature(OrionAttributeTemperature temperature) {
        this.temperature = temperature;
    }

    public OrionAttributeMaxBloodPressure getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(OrionAttributeMaxBloodPressure maxPressure) {
        this.maxPressure = maxPressure;
    }

    public OrionAttributeMinBloodPressure getMinPressure() {
        return minPressure;
    }

    public void setMinPressure(OrionAttributeMinBloodPressure minPressure) {
        this.minPressure = minPressure;
    }

    public OrionAttributePulseRate getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(OrionAttributePulseRate pulseRate) { this.pulseRate = pulseRate; }
}
