package it.unile.smarcare.model;

public class OrionAttributeBloodPressure extends OrionAttribute {

    private Integer value;

    public OrionAttributeBloodPressure() {
        super("Integer");
    }

    public OrionAttributeBloodPressure(Integer value) {
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
