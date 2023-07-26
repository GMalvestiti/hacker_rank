import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < t; i++) {
            int age = Integer.parseInt(bufferedReader.readLine().trim());
            
            Person person = new Person(age);

            person.amIOld();

            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            person.amIOld();
            System.out.println("");
        }

        bufferedReader.close();
    }
}