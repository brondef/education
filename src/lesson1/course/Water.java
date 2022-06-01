package lesson1.course;

import lesson1.Participant;

public class Water extends Obstacle{
    private int swimDistance;

    public Water(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(this.swimDistance);
    }
}
