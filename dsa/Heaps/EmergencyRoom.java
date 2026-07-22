import java.util.PriorityQueue;

class EmergencyRoom {

    PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient treatNext() {
        if (triageQueue.isEmpty()) {
            return null;
        }
        return triageQueue.poll();
    }

    public Patient peekPatient() {
        return triageQueue.peek();
    }

    public void display() {
        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.name + " " + p.severity);
        }
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.addPatient(new Patient("Rahul", 5));
        er.addPatient(new Patient("Aditi", 10));
        er.addPatient(new Patient("Karan", 3));
        er.addPatient(new Patient("Priya", 8));

        System.out.println("Next Patient : "
                + er.treatNext().name);

        System.out.println("Most Severe Waiting : "
                + er.peekPatient().name);

        System.out.println("\nRemaining Patients:");

        er.display();
    }
}