import java.io.*;

public class Try_With_Resources{
    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader("info.txt"))) {

            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}