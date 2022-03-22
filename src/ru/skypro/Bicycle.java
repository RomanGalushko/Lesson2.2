package ru.skypro;

public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    void checkEngine() {
        throw new IllegalStateException("Not implemented");
    }

    @Override
    void checkTrailer() {
        throw new IllegalStateException("Not implemented");
    }


}
