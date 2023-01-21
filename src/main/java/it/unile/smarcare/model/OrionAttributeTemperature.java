package it.unile.smarcare.model;

public class OrionAttributeTemperature extends OrionAttribute {

    private Double value;

    public OrionAttributeTemperature() {
        super("Float");
    }

    public OrionAttributeTemperature(Double value) {
        super("Float");
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
