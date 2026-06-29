interface TextModeration {
    void checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive words allowed");
    }

    static boolean containsRestrictedWord(String post) {
        return post.contains("bad");
    }
}

interface SpamDetection {
    void detectSpam(String post);

    default void displaySpamPolicy() {
        System.out.println("No spam links allowed");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public void checkText(String post) {
        if (TextModeration.containsRestrictedWord(post)) {
            System.out.println(post + " -> Offensive Post");
        }
    }

    public void detectSpam(String post) {
        if (post.contains("http")) {
            System.out.println(post + " -> Spam Post");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String posts[] = {
                "Hello everyone",
                "This is bad content",
                "Visit http://spam.com"
        };

        ContentModerator c = new ContentModerator();

        c.displayModerationPolicy();
        c.displaySpamPolicy();

        for (String post : posts) {
            c.checkText(post);
            c.detectSpam(post);

            if (!TextModeration.containsRestrictedWord(post) && !post.contains("http")) {
                System.out.println(post + " -> Valid Post");
            }
        }
    }
}