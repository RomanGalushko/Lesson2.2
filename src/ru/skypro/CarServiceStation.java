package ru.skypro;

public class CarServiceStation implements ServiceStation {
    @Override
    public void printTransport(Transport transport) {
        Car car = (Car) transport;
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }
}
