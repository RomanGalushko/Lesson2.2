package ru.skypro;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", хитрость - " + cunning +
                ", решительность - " + determination +
                ", амбициозность - " + ambition +
                ", находчивость - " + resourcefulness +
                ", жажда власти - " + thirstForPower;
    }
    public void compareStudents(Slytherin students) {
        System.out.println("Сравнение студентов факультета Слизерин: ");
        if (this.getCunning() > students.getCunning()) {
            System.out.println(this.getName() + " хитрее, чем " + students.getName() + ".");
        } else  if (this.getCunning() < students.getCunning()){
            System.out.println(students.getName() + " хитрее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " не уступают в хитрости. \n");
        }
        if (this.getDetermination() > students.getDetermination()) {
            System.out.println(this.getName() + " более ришительнее, чем " + students.getName() + ".");
        } else  if (this.getDetermination() < students.getDetermination()){
            System.out.println(students.getName() + " более ришительнее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы решительны. \n");
        }
        if (this.getAmbition() > students.getAmbition()) {
            System.out.println(this.getName() + " более амбициознее, чем " + students.getName() + ".");
        } else  if (this.getAmbition() < students.getAmbition()){
            System.out.println(students.getName() + " более амбициознее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы амбициозны. \n");
        }
        if (this.getResourcefulness() > students.getResourcefulness()) {
            System.out.println(this.getName() + " более находчивее, чем " + students.getName() + ".");
        } else  if (this.getResourcefulness() < students.getResourcefulness()){
            System.out.println(students.getName() + " более находчивее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба находчивы. \n");
        }
        if (this.getThirstForPower() > students.getThirstForPower()) {
            System.out.println(this.getName() + " болше жаждит власти, чем " + students.getName() + ".");
        } else  if (this.getThirstForPower() < students.getThirstForPower()){
            System.out.println(students.getName() + " болше жаждит власти, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба жаждут власти. \n");
        }
    }
}
