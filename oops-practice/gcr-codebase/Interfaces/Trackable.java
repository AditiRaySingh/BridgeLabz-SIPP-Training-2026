interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Data reset successfully");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity Logged: Running 5km");
    }

    public void generateReport() {
        System.out.println("Report Generated");
    }

    public void sendAlert() {
        System.out.println("Reminder: Drink Water");
    }
}

public class Main {
    public static void main(String[] args) {
        FitnessDevice f = new FitnessDevice();

        f.logActivity();
        f.generateReport();
        f.sendAlert();
        f.resetData();
    }
}