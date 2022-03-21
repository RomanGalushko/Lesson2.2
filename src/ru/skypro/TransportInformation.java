package ru.skypro;

public class TransportInformation {
    private final String modelName;
    private final int wheelsCount;

    public TransportInformation(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    void updateTyre() {}
    void checkEngine() {
    }
    void checkTrailer() {
    }
}
