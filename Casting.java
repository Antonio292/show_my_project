package SelfStudy.TeamProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Casting {
    private Participant participant = new Participant();
    private String id;
    private String name;
    private String description;
    private String location;
    private List<Participant> participants = new ArrayList<>();
    CastingMain castingMain = new CastingMain();
    public Casting(String id, String name, String description, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public void registerParticipant(Participant participant) {
        if ((participant.getId() == null) || (participant.getId().isEmpty())) {
            System.out.println("You enter incorrect Id!");
//            throw new IllegalArgumentException("You enter incorrect Id!");
        } else if ((participant.getName() == null) || (participant.getName().isEmpty())) {
            System.out.println("You enter incorrect Name!");
//            throw new IllegalArgumentException("You enter incorrect Name!");
        } else if ((participant.getStatus() == null) || (participant.getStatus().isEmpty())) {
            System.out.println("You enter incorrect Status!");
//            throw new IllegalArgumentException("You enter incorrect Status!");
        } else {
            participants.add(participant);
        }
    }

    public void updateStatus(String participantName, String newStatus) {

    }

    public List<Participant> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }
}
