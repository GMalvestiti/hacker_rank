import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Already defined
        int i = 4;
        Double d = 4.0;
        String s = "HackerRank ";

        // Challenge
        int x = scan.nextInt();
        Double y = scan.nextDouble();
        scan.nextLine();
        String z = scan.nextLine();

        System.out.println(i + x);
        System.out.printf("%.1f%n", d + y);
        System.out.println(s + z);

        scan.close();
    }
}
