package SelfStudy.TeamProject;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CastingMain {
    private static Participant participant = new Participant();
    public static void main(String[] args) {

        Casting casting = new Casting("a123", "Casting", "bla", "bla");
        buildParticipant();
        casting.registerParticipant(participant);
        casting.registerParticipant(participant);
        showParticipants(casting);
    }

    private static void showParticipants(Casting casting) {
        for (Participant participant: casting.getParticipants()) {
            System.out.println(participant);
        }
    }

    private static Participant buildParticipant() {
        Scanner scanner = new Scanner(System.in);
        Participant participant = new Participant();
        System.out.println("Enter Participant Id: ");
        String id = scanner.nextLine();
        participant.setId(id);

        System.out.println("Enter Participant Name: ");
        String name = scanner.nextLine();
        participant.setName(name);

        System.out.println("Enter Participant Status: ");
        String status = scanner.nextLine();
        participant.setStatus(status);
        return participant;
    }
}
