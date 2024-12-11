package SelfStudy.TeamProject;

public class Participant {
    private String id;
    private String name;
    private String status;


    public Participant(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}