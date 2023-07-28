import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int newNumber = scan.nextInt();
            list.add(newNumber);
        }

        for (int item : list) {
            System.out.printf("%d ", item);
        }

        scan.close();
    }
}