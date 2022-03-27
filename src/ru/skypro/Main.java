package ru.skypro;

public class Main {

    static Gryffindor harryPotter = new Gryffindor("Гарри Поттер",70,26,70, 25, 8);
    static Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",80,42,10, 32, 12);
    static Gryffindor ronWeasley = new Gryffindor("Рон Уизли",40,23,50, 10, 6);

    static Pooffendui zachariahSmith = new Pooffendui("Захария Смит",66,45,78,6,13);
    static Pooffendui cedricDiggory = new Pooffendui("Седрик Диггори",34,71,56, 16,8);
    static Pooffendui justinFinchFletchley = new Pooffendui("Джастин Финч-Флетчли",23,89,10,1,65);

    static Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",68,81,55,36,12,23);
    static Ravenclaw padmaPatil  = new Ravenclaw("Падма Патил",86,44,68,91,54,7);
    static Ravenclaw marcusBelby  = new Ravenclaw("Маркус Белби",26,68,98,87,99,1);

    static Slytherin dracoMalfoy = new Slytherin("Драко Малфой",60,87,90,45,99,66,53);
    static Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю",40,33,52,77,66,32,54);
    static Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",25,53,21,68,70,12,89);


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Студенты факультета Гриффиндор: ");
        System.out.println(harryPotter + "; \n" + hermioneGranger + "; \n" + ronWeasley + ". \n");
        System.out.println("Студенты факультета Пуффендуй: ");
        System.out.println(zachariahSmith + "; \n" + cedricDiggory + "; \n" + justinFinchFletchley + ". \n");
        System.out.println("Студенты факультета Когтевран: ");
        System.out.println(zhouChang + "; \n" + padmaPatil + "; \n" + marcusBelby + ". \n");
        System.out.println("Студенты факультета Слизерин: ");
        System.out.println(dracoMalfoy + "; \n " + grahamMontague + "; \n" + gregoryGoyle + ". \n");

        harryPotter.compareStudents(hermioneGranger);
        System.out.println();
        cedricDiggory.compareStudents(zachariahSmith);
        System.out.println();
        padmaPatil.compareStudents(marcusBelby);
        System.out.println();
        dracoMalfoy.compareStudents(gregoryGoyle);
        System.out.println();
        harryPotter.compareHogwarts(dracoMalfoy);
        System.out.println();

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