import java.util.Scanner;

class Calculator {

    int power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return ((int) Math.pow(a, b));
        }
    }
}

class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            try {
                Calculator calculator = new Calculator();
                System.out.println(calculator.power(a, b));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        scan.close();
    }
}