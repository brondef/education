package lesson1.Animal;

import lesson1.Participant;
import lesson1.enums.Color;

public class Dog extends Animal implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Dog(String name, Color color, int age,int runDistance, int jumpHeight,int swimDistance) {
        super(name, color, age);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
        isOnDistance = true;
    }

    @Override
    public void voice() {
        System.out.println("��� - ���");

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

        System.out.printf("������ %s ��������� ����� ������� %d%n", getName(), distance);
    }

    @Override
    public void jump(int height) {
        if(!isOnDistance) {
            return;
        }
            if (height > jumpHeight) {
               this.isOnDistance = false;
            }

        System.out.printf("������ %s �������� �� ������ %d%n", getName(), height);
    }


    @Override
    public void swim(int distance) {
        if(!isOnDistance) {
            return ;
        }
            if (distance > swimDistance) {
                isOnDistance = false;
            }

        System.out.printf("������ %s �������� ������� ������� %d%n", getName(), distance);
    }

    @Override
    public void getResult() {
      System.out.printf("������ %s %s ������ ������ ����������� %n",getName(), isOnDistance ? "" : "��");
    }
}

