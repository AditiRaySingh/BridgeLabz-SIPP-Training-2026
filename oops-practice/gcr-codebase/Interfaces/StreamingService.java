interface StreamingService {
    void watchMovie();

    default void showSubscriptionDetails() {
        System.out.println("Netflix Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Pass Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void watchMovie() {
        System.out.println("Watching Movie...");
    }

    public void playGame() {
        System.out.println("Playing Game...");
    }

    // Resolving default method conflict
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();

        tv.watchMovie();
        tv.playGame();
        tv.showSubscriptionDetails();
    }
}