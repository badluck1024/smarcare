package it.unile.smarcare.model;

public class SensorDataOrion {

    private String id;
    private String type;
    private OrionAttributeTemperature temperature;
    private OrionAttributeBloodPressure pressure;

    public SensorDataOrion(String id, String type, OrionAttributeTemperature temperature, OrionAttributeBloodPressure pressure) {
        this.id = id;
        this.type = type;
        this.temperature = temperature;
        this.pressure = pressure;
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

    public OrionAttributeBloodPressure getPressure() {
        return pressure;
    }

    public void setPressure(OrionAttributeBloodPressure pressure) {
        this.pressure = pressure;
    }
}
