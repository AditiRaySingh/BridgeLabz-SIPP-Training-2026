import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact added.");
    }

    public static void searchContact(String name) {
        if (map.containsKey(name)) {
            Contact c = map.get(name);
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void deleteContact(String name) {
        if (map.containsKey(name)) {
            Contact c = map.get(name);
            contacts.remove(c);
            phoneSet.remove(c.phone);
            map.remove(name);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void displayContacts() {
        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        for (Contact c : contacts) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        }
    }

    public static void main(String[] args) {
        addContact("Aditi", "12345", "aditi@gmail.com");
        addContact("Rahul", "67890", "rahul@gmail.com");

        searchContact("Aditi");
        displayContacts();
        deleteContact("Rahul");
    }
}