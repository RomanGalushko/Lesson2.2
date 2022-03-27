package ru.skypro;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", благородство - " + nobility +
                ", честь - " + honor +
                ", храбрость - " + bravery;
    }
    public void compareStudents(Gryffindor students) {
        System.out.println("Сравнение студентов факультета Гриффиндор: ");
        if (this.getNobility() > students.getNobility()) {
            System.out.println(this.getName() + " благороднее, чем " + students.getName() + ".");
        } else  if (this.getNobility() < students.getNobility()){
            System.out.println(students.getName() + " благороднее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба одинаковы благородны. \n");
        }
        if (this.getHonor() > students.getHonor()) {
            System.out.println(this.getName() + " обладают большей честью, чем " + students.getName() + ".");
        } else  if (this.getHonor() < students.getHonor()){
            System.out.println(students.getName() + " обладают большей честью, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы обладают честью. \n");
        }
        if (this.getBravery() > students.getBravery()) {
            System.out.println(this.getName() + " храбрее, чем " + students.getName() + ".");
        } else  if (this.getBravery() < students.getBravery()){
            System.out.println(students.getName() + " храбрее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы храбры. \n");
        }
    }
}
