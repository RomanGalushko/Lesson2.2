package ru.skypro;

public class Main {

    public static void main(String[] args) {

        ServiceStation carServiceStation = new CarServiceStation();

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        carServiceStation.printTransport(car);
        carServiceStation.printTransport(car2);

        ServiceStation bicycleServiceStation = new BicycleServiceStation();

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle1", 2);

        bicycleServiceStation.printTransport(bicycle);
        bicycleServiceStation.printTransport(bicycle2);

        ServiceStation truckServiceStation = new TruckServiceStation();

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        truckServiceStation.printTransport(truck);
        truckServiceStation.printTransport(truck2);

    }
}
