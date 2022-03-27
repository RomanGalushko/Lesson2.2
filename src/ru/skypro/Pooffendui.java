package ru.skypro;

import java.util.Objects;

public class Pooffendui extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Pooffendui(String name, int powerMagic, int distanceTransgression, int diligence, int loyalty, int honesty) {
        super(name, powerMagic, distanceTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие - " + diligence +
                ", верность - " + loyalty +
                ", честность - " + honesty;
    }
    public void compareStudents(Pooffendui students) {
        System.out.println("Сравнение студентов факультета Пуффендуй: ");
        if (this.getDiligence() > students.getDiligence()) {
            System.out.println(this.getName() + " больше трудолюбив, чем " + students.getName() + ".");
        } else  if (this.getDiligence() < students.getDiligence()){
            System.out.println(students.getName() + " больше трудолюбив, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба одинаковы трудолюбивы. \n");
        }
        if (this.getLoyalty() > students.getLoyalty()) {
            System.out.println(this.getName() + " обладают большей верностью, чем " + students.getName() + ".");
        } else  if (this.getLoyalty() < students.getLoyalty()){
            System.out.println(students.getName() + " обладают большей верностью, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы обладают верны. \n");
        }
        if (this.getHonesty() > students.getHonesty()) {
            System.out.println(this.getName() + " более честен, чем " + students.getName() + ".");
        } else  if (this.getHonesty() < students.getHonesty()){
            System.out.println(students.getName() + " более честен, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы честны. \n");
        }
    }
}
