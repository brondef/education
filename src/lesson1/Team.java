package lesson1;

public class Team {
    private Participant[] participants;

    public Team(Participant... participants){
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }
    public void getResults(){
        for(Participant participant : participants){
            participant.getResult();
        }
    }
}
