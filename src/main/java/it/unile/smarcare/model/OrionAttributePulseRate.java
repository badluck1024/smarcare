package it.unile.smarcare.model;

public class OrionAttributePulseRate extends OrionAttribute {

    private Double value;

    public OrionAttributePulseRate() {
        super("Float");
    }

    public OrionAttributePulseRate(Double value) {
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
