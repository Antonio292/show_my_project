package SelfStudy.TeamProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Casting {
    private String id;
    private String name;
    private String description;
    private String location;
    private List<Participant> participants = new ArrayList<>();

    public Casting(String description, String id, String location, String name, List<Participant> participants) {
        this.description = description;
        this.id = id;
        this.location = location;
        this.name = name;
        this.participants.addAll(participants);
    }

    public void registerParticipant(String name, String id, String status) {
        if ((name.isEmpty()) || (name == null)) {
            System.out.println("You enter incorrect Name!");
        }
        else if ((id.isEmpty()) || (id == null)) {
            System.out.println("You enter incorrect Id!");
        }
        else if ((status.isEmpty()) || (status == null)) {
            System.out.println("You enter incorrect Status!");
        }
        else {
            Participant participant = new Participant(id, name, status);
            participants.add(participant);
        }
    }

    public void updateStatus(String participantName, String newStatus) {

    }

    public void showParticipants(List<Participant> participants) {
        for (Participant participant: participants) {
            System.out.println(participant);
        }
    }


}
