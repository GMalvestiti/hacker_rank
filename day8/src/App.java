import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine().trim());

        Map<String, String> book = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] str = scan.nextLine().trim().split(" ");
            book.put(str[0], str[1]);
        }

        while (scan.hasNext()) {
            String str = scan.nextLine().trim();
            if (book.containsKey(str)) {
                System.out.printf("%s=%s%n", str, book.get(str));
            } else {
                System.out.printf("Not found%n");
            }
        }

        scan.close();
    }
}