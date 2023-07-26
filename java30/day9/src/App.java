import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * App.factorial(n - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = App.factorial(n);

        System.out.println(result);

        bufferedReader.close();
    }
}
