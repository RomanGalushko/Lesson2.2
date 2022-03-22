package ru.skypro;

public class TruckServiceStation implements ServiceStation {

    public void printTransport(Transport transport) {
        Truck truck = (Truck) transport;
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}
