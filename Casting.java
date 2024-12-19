package SelfStudy.TeamProject;


import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
@Slf4j
public class Casting {
    private static final Logger log = LoggerFactory.getLogger(Casting.class);
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

    public void registerParticipant(Participant participant) {
        if ((participant.getId() == null) || (participant.getId().isEmpty())) {
            System.out.println("You enter incorrect Id!");
//            throw new IllegalArgumentException("You enter incorrect Id!");
            log.warn("attempt to enter incorrect id");
        } else if ((participant.getName() == null) || (participant.getName().isEmpty())) {
            System.out.println("You enter incorrect Name!");
//            throw new IllegalArgumentException("You enter incorrect Name!");
            log.warn("attempt to enter incorrect Name");
        } else if ((participant.getStatus() == null) || (participant.getStatus().isEmpty())) {
            System.out.println("You enter incorrect Status!");
//            throw new IllegalArgumentException("You enter incorrect Status!");
            log.warn("attempt to enter incorrect Status");
        } else {
            participants.add(participant);
            log.info("new participant was added");
        }
    }

    public void updateStatus(String newStatus, String id) {
        Participant participant1 = null;
        for (Participant participant: participants){
            if (participant.getId().equals(id)) {
                participant1 = participant;
            }
        }
        participant1.setStatus(newStatus);
        System.out.println("Status was changed");
        log.info("status was changed");
    }

    public List<Participant> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }
}
