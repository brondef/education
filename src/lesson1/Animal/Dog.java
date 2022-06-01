package lesson1.Animal;

import lesson1.Participant;
import lesson1.enums.Color;

public class Dog extends Animal implements Participant {

    public Dog(String name, Color color, int age) {
        super(name, color, age);
    }

    public Dog(String name, Color color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("√‡‚ - √‡‚");

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

