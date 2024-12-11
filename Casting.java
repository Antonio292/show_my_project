package SelfStudy.TeamProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Casting {
    private String id;
    private String name;
    private String description;
    private String location;
    private List<Participant> participants = new ArrayList<>();

    public Casting(String id, String name, String description, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public void registerParticipant(String id, String name, String status) {
        if ((id == null) || (id.isEmpty())) {
            System.out.println("You enter incorrect Id!");
                   throw new IllegalArgumentException("You enter incorrect Id!");
        } else if ((name == null) || (name.isEmpty())) {
            System.out.println("You enter incorrect Name!");
                    throw new IllegalArgumentException("You enter incorrect Name!");
        } else if ((status == null) || (status.isEmpty())) {
            System.out.println("You enter incorrect Status!");
                    throw new IllegalArgumentException("You enter incorrect Status!");
        } else {
            Participant participant = new Participant(id, name, status);
            participants.add(participant);
        }
    }

    public void updateStatus(String participantName, String newStatus) {

    }

    public void showParticipants() {
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }

    public List<Participant> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }
}
