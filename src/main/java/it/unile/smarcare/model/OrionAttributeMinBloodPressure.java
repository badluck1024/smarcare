package it.unile.smarcare.model;

public class OrionAttributeMinBloodPressure extends OrionAttribute {

    private Integer value;

    public OrionAttributeMinBloodPressure() {
        super("Integer");
    }

    public OrionAttributeMinBloodPressure(Integer value) {
        super("Integer");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
