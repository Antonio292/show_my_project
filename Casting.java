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
        if ((id == null) || (id.isEmpty())) {
            System.out.println("You enter incorrect Casting Id!");
//            throw new IllegalArgumentException("You enter incorrect Id!");
            log.warn("attempt to enter incorrect Casting id");
        } else {
            this.id = id;
            log.info("Casting id was added");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name == null) || (name.isEmpty())) {
            System.out.println("You enter incorrect Casting Name!");
//            throw new IllegalArgumentException("You enter incorrect Name!");
            log.warn("attempt to enter incorrect Casting Name");
        } else {
            this.name = name;
            log.info("Casting name was added");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if ((description == null) || (description.isEmpty())) {
            System.out.println("You enter incorrect Casting description!");
//            throw new IllegalArgumentException("You enter incorrect Name!");
            log.warn("attempt to enter incorrect Casting description");
        } else {
            this.description = description;
            log.info("Casting description was added");
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if ((location == null) || (location.isEmpty())) {
            System.out.println("You enter incorrect Casting location!");
//            throw new IllegalArgumentException("You enter incorrect Name!");
            log.warn("attempt to enter incorrect Casting location");
        } else {
            this.location = location;
            log.info("Casting location was added");
        }
    }

    public void registerParticipant(Participant participant) {
        participants.add(participant);
        log.info("new participant was added");
    }

    public void updateStatus(String newStatus, String id) {
        Participant participant1 = null;
        for (Participant participant : participants) {
            if (participant.getId().equals(id)) {
                participant1 = participant;
            }
        }
        if (newStatus != null && !newStatus.isEmpty()) {
            participant1.setStatus(newStatus);
            System.out.println("Status was changed");
            log.info("status was changed");
        }
    }

    private static void showParticipants(Casting casting) {
        for (Participant participant: casting.getParticipants()) {
            System.out.println(participant);
        }
    }

    public List<Participant> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }
}
