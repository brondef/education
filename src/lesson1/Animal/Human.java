package lesson1.Animal;

import lesson1.Participant;

public class Human extends Animal implements Participant {
    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;


    public Human(String name,int age,int runDistance, int jumpHeight,int swimDistance) {
        super(name, age);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
        isOnDistance = true;
    }

    @Override
    public void voice() {
        System.out.printf("ѕривет мен€ зовут %s, мне %d лет ", getName(),getAge());

    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if(!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
        }

        System.out.printf(" %s пробежал кросс длинной %d%n", getName(), distance);
    }

    @Override
    public void jump(int height) {
        if(!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
        }

        System.out.printf("%s прыгнул на высоту %d%n", getName(), height);
    }


    @Override
    public void swim(int distance) {

        if(!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
        }

        System.out.printf(" %s проплыл отрезок длинной %d", getName(), distance);
    }

    @Override
    public void getResult() {
        System.out.printf("%s %s прошЄл полосу преп€дствий %n",getName(), isOnDistance ? "" : "не");
    }

}
