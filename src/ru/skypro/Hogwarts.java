package ru.skypro;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private final int powerMagic;
    private final int distanceTransgression;

    public Hogwarts(String name,int powerMagic, int distanceTransgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }
    public int getPowerMagic() {
        return powerMagic;
    }
    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    @Override
    public String toString() {
        return "Студент: " + name +
                ", сила магии - " + powerMagic +
                ", расстояние трансгресии - " + distanceTransgression;
    }
    public void compareHogwarts(Hogwarts students) {
        System.out.println("Сравнение студентов Хогвартца: ");
        if (this.getPowerMagic() > students.getPowerMagic()) {
            System.out.println(this.getName() + " сильнее в магии, чем " + students.getName() + ".");
        } else  if (this.getPowerMagic() < students.getPowerMagic()){
            System.out.println(students.getName() + " сильнее в магии, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба обладают одинаковой силой магии. \n");
        }
        if (this.getDistanceTransgression() > students.getDistanceTransgression()) {
            System.out.println(this.getName() + " расстояние трансгреесии больше, чем " + students.getName() + ".");
        } else  if (this.getDistanceTransgression() < students.getDistanceTransgression()){
            System.out.println(students.getName() + " расстояние трансгреесии больше, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " расстояние трансгреесии одинаково. \n");
        }
    }

}
