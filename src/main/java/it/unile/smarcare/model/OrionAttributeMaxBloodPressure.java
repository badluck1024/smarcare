package it.unile.smarcare.model;

public class OrionAttributeMaxBloodPressure extends OrionAttribute {

    private Integer value;

    public OrionAttributeMaxBloodPressure() {
        super("Integer");
    }

    public OrionAttributeMaxBloodPressure(Integer value) {
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
