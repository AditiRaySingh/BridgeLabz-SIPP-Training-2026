import java.util.*;

public class EventEntry {
    static HashSet<String> participants = new HashSet<>();

    public static void register(String email) {
        if (participants.add(email)) {
            System.out.println("Registration successful: " + email);
        } else {
            System.out.println("Duplicate registration rejected.");
        }
    }

    public static void displayParticipants() {
        System.out.println("Registered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {
        register("aditi@gmail.com");
        register("rahul@gmail.com");
        register("aditi@gmail.com");

        displayParticipants();
    }
}