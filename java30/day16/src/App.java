import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            int number = Integer.parseInt(S);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}