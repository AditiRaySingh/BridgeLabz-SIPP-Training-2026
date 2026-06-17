public class Online_Quiz_Application {

    public static void main(String[] args) {

        String answers[] = {"A","B","C","D"};

        for(int i=0;i<=5;i++) {

            try {

                if(answers[i].equals("A")) {
                    System.out.println("Correct");
                }

            } catch(ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Question index not found: " + i);

            } catch(NullPointerException e) {

                System.out.println(
                        "Answer missing at index: " + i);
            }
        }
    }
}