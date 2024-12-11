package SelfStudy.TeamProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CastingManager {

    static Scanner scanner = new Scanner(System.in);
    static Map<String, Casting> castings = new HashMap<>();

    public static void main(String[] args) {

    }

    public static void showMenu() {

    }

    public static void createCasting() {

        System.out.println("Enter the id of Casting");
        String id = scanner.nextLine();
        System.out.println("Enter the name of Casting");
        String name = scanner.nextLine();
        System.out.println("Enter the description of Casting");
        String description = scanner.nextLine();
        System.out.println("Enter the location of Casting");
        String location = scanner.nextLine();

        if (id.isEmpty() || id==null) {
            System.out.println("Id is empty, I can't add Casting with empty Id!");
        }
        else if (name.isEmpty() || name==null) {
            System.out.println("Name is empty, I can't add Casting with empty Name!");
        }
        else if (description.isEmpty() || description==null) {
            System.out.println("Description is empty, I can't add Casting with empty Description!");
        }
        else if (location.isEmpty() || location==null) {
            System.out.println("Location is empty, I can't add Casting with empty Location!");
        }
        else {
 //           Casting casting = new Casting(description,name,location,id);
   //         castings.put(id,casting);
        }
    }

    public static void findCasting() {
        System.out.println("Enter casting Id: ");
        String idToFind = scanner.nextLine();
        if (castings.containsKey(idToFind)){
            System.out.println(castings.get(idToFind));
        }
    }
}
