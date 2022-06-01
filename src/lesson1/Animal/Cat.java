package lesson1.Animal;

import lesson1.Participant;
import lesson1.enums.Color;

public class Cat extends Animal implements Participant {


    public Cat(String name, Color color, int age) {
        super(name, color, age);
    }

    public Cat(String name, Color color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Ìÿó - ìÿó");
    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public void swim(int distance) {

    }
}
