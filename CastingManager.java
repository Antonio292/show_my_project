package SelfStudy.TeamProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CastingManager {
    static String id = "";
    static String newStatus = "";
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Casting> castings = new HashMap<>();

    public static void main(String[] args) {

    }

    public static void showMenu() {

    }

    public static Casting buildCasting() {
        Casting casting = new Casting();

        System.out.println("Enter Casting Id: ");
        String id = scanner.nextLine();
        casting.setId(id);

        System.out.println("Enter Casting name: ");
        String name = scanner.nextLine();
        casting.setName(name);

        System.out.println("Enter Casting description: ");
        String description = scanner.nextLine();
        casting.setDescription(description);

        System.out.println("Enter Casting location: ");
        String location = scanner.nextLine();
        casting.setLocation(location);

        return casting;
    }

    public static void registerCasting(Casting casting) {
        if (casting.getId() == null || casting.getId().isEmpty()) {
            System.out.println("Id is empty, I can't add Casting with empty Id!");
        }
        else if (casting.getName()==null || casting.getName().isEmpty()) {
            System.out.println("Name is empty, I can't add Casting with empty Name!");
        }
        else if (casting.getDescription()==null || casting.getDescription().isEmpty()) {
            System.out.println("Description is empty, I can't add Casting with empty Description!");
        }
        else if (casting.getLocation()==null || casting.getLocation().isEmpty()) {
            System.out.println("Location is empty, I can't add Casting with empty Location!");
        }
        else {
            castings.put(casting.getId(),casting);
        }
    }

    public static void findCasting() {
        System.out.println("Enter casting Id: ");
        String idToFind = scanner.nextLine();
        if (castings.containsKey(idToFind)){
            System.out.println(castings.get(idToFind));
        }
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

    private static void gettingNewStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Participant Id: ");
        id = scanner.nextLine();
        System.out.println("Enter new status for this Participant: ");
        newStatus = scanner.nextLine();

    }

}
