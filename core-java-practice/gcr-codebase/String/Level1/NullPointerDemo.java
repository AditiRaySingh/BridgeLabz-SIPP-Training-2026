public class NullPointerDemo {

    public static void generateException() {

        String text = null;

        System.out.println(text.length());
    }

    public static void handleException() {

        String text = null;

        try {

            System.out.println(text.length());

        } catch (NullPointerException e) {

            System.out.println("NullPointerException Handled Successfully");
        }
    }

    public static void main(String[] args) {

        System.out.println("Handling Exception:");

        handleException();

        System.out.println();

        System.out.println("Generating Exception:");

        generateException();
    }
}