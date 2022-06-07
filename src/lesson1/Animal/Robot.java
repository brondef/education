package lesson1.Animal;

import lesson1.Participant;

public class Robot implements Participant {
    private final String name;
    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Robot(String name,int runDistance, int jumpHeight,int swimDistance) {
       this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
       isOnDistance = true;
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
            return;
        }

        System.out.printf(" %s �������� ����� ������� %d%n", getName(), distance);
    }

    @Override
    public void jump(int height) {
        if(!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }

        System.out.printf("%s ������� �� ������ %d%n", getName(), height);
    }


    @Override
    public void swim(int distance) {

        if(!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            return;
        }

        System.out.printf(" %s ������ ��������� %d �� ���!%n", getName(), distance);
    }

    @Override
    public void getResult() {
        System.out.printf("%s %s ������ ������ ����������� %n",getName(), isOnDistance ? "" : "��");
    }

    public String getName() {
        return name;
    }
}
