package ru.skypro;

public class BicycleServiceStation implements ServiceStation {
    @Override
    public void printTransport(Transport transport) {
        Bicycle bicycle = (Bicycle) transport;
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
