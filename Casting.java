package SelfStudy.TeamProject;


import lombok.ToString;
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
@ToString
public class Casting {
    private static final Logger log = LoggerFactory.getLogger(Casting.class);
    private String id;
    private String name;
    private String description;
    private String location;
    private List<Participant> participants = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
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
