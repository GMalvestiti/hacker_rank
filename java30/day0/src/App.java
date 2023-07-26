import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        System.out.println("Hello, World.\n" + message);
        scan.close();
    }
}
