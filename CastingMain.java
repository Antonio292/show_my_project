package SelfStudy.TeamProject;


import java.util.ArrayList;
import java.util.List;

public class CastingMain {
    public static void main(String[] args) {
        String id = "a123";
        String name = "Metallica";
        String status = "new";
        String id1 = "a234";
        String name1 = "OffSpring";
        String status1 = "new";
        List<Participant>participants = new ArrayList<>();

        Casting casting = new Casting("bla", "a123", "bla", "Casting1", participants);
        casting.registerParticipant(name,id,status);
        casting.registerParticipant(name1, id1, status1);
        casting.showParticipants(participants);
    }
}
