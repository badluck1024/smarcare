package it.unile.smarcare.model;

public class SensorData {

    private double temperature;
    private int pulseRate;
    private int minBloodPressure;

    private int maxBloodPressure;

    public SensorData() {
    }

    public SensorData(double temperature, int pulseRate, int minBloodPressure, int maxBloodPressure) {
        this.temperature = temperature;
        this.pulseRate = pulseRate;
        this.minBloodPressure = minBloodPressure;
        this.maxBloodPressure = maxBloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getMinBloodPressure() {
        return minBloodPressure;
    }

    public void setMinBloodPressure(int minBloodPressure) {
        this.minBloodPressure = minBloodPressure;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "temperature=" + temperature +
                ", pulseRate=" + pulseRate +
                ", minBloodPressure=" + minBloodPressure +
                ", maxBloodPressure=" + maxBloodPressure +
                '}';
    }
}
