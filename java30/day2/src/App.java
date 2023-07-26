import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        // Total cost calculation
        Double tip = (tipPercent * mealCost) / 100;
        Double tax = (taxPercent * mealCost) / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println(totalCost);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double mealCost = Double.parseDouble(bufferedReader.readLine().trim());

        int tipPercent = Integer.parseInt(bufferedReader.readLine().trim());

        int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());

        App.solve(mealCost, tipPercent, taxPercent);

        bufferedReader.close();
    }
}