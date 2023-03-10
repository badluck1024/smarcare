package it.unile.smarcare.model;

public class OrionAttributePulseRate extends OrionAttribute {

    private Integer value;

    public OrionAttributePulseRate() {
        super("Float");
    }

    public OrionAttributePulseRate(int value) {
        super("Float");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
