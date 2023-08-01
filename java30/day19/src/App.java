import java.util.Scanner;

interface AdvancedArithmetic {

    public int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        int sum = 0;

        for (int i = n; i > 0; i--) {
            if ((n % i) == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Calculator calculator = new Calculator();
        System.out.printf("I implemented: AdvancedArithmetic%n%d%n", calculator.divisorSum(n));

        scan.close();
    }
}