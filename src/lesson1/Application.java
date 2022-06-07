package lesson1;

import lesson1.Animal.Cat;
import lesson1.Animal.Dog;
import lesson1.Animal.Human;
import lesson1.Animal.Robot;
import lesson1.course.Course;
import lesson1.course.Cross;
import lesson1.course.Wall;
import lesson1.course.Water;
import lesson1.enums.Color;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("������", Color.WHITE, 5,200,5,0);
        Dog dog = new Dog("�����", Color.BROWN, 1,1001,1,100);
        Human human = new Human("����",25,500,1,500);
        Robot robot = new Robot("Sali",1,1,1);


        Course course = new Course(new Cross(100),new Water(100),new Wall(2));   // ������� ������ �����������
        Team team = new Team(cat,dog,human,robot); // ������� �������
        course.doIt(team);// ������ ������� ������ ������
        team.getResults(); // ���������� ����������
    }
}
