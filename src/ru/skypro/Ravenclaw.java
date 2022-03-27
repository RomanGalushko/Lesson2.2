package ru.skypro;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int pwit;
    private final int fullOfCreativity;

    public Ravenclaw(String name, int powerMagic, int distanceTransgression, int mind, int wisdom, int pwit, int fullOfCreativity) {
        super(name, powerMagic, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.pwit = pwit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getMind() {
        return mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getPwit() {
        return pwit;
    }
    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ум - " + mind +
                ", мудрость - " + wisdom +
                ", остроумие - " + pwit +
                ", полны творчества - " + fullOfCreativity;
    }
    public void compareStudents(Ravenclaw students) {
        System.out.println("Сравнение студентов факультета Когтевран: ");
        if (this.getMind() > students.getMind()) {
            System.out.println(this.getName() + " умнее, чем " + students.getName() + ".");
        } else  if (this.getMind() < students.getMind()){
            System.out.println(students.getName() + " умнее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба одинаковы умны. \n");
        }
        if (this.getWisdom() > students.getWisdom()) {
            System.out.println(this.getName() + " мудрее, чем " + students.getName() + ".");
        } else  if (this.getWisdom() < students.getWisdom()){
            System.out.println(students.getName() + " мудрее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы мудры. \n");
        }
        if (this.getPwit() > students.getPwit()) {
            System.out.println(this.getName() + " более остроуменее, чем " + students.getName() + ".");
        } else  if (this.getPwit() < students.getPwit()){
            System.out.println(students.getName() + " более остроуменее, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " одинаковы остроумены. \n");
        }
        if (this.getFullOfCreativity() > students.getFullOfCreativity()) {
            System.out.println(this.getName() + " более творческий, чем " + students.getName() + ".");
        } else  if (this.getFullOfCreativity() < students.getFullOfCreativity()){
            System.out.println(students.getName() + " более творческий, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + students.getName() + " оба творческие. \n");
        }
    }
}
