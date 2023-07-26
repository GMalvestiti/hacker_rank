import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i + 1, n * (i + 1));
        }

        bufferedReader.close();
    }
}