package lesson1;

import lesson1.Animal.Animal;

public class Team {
    private Animal[] participants;

    public Team(Animal... participants){
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }
}
