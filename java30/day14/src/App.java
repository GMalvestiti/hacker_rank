import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > maximumDifference) {
                    maximumDifference = diff;
                }
            } 

            
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = scan.nextInt();
        }

        Difference difference = new Difference(elements);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);

        scan.close();
    }
}