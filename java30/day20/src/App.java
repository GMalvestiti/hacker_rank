import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static List<Integer> swap(List<Integer> a, int j) {
        int temp = a.get(j);
        a.set(j, a.get(j + 1));
        a.set(j + 1, temp);
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    a = App.swap(a, j);
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.printf("Array is sorted in %d swaps.%nFirst Element: %d%nLast Element: %d", numberOfSwaps, a.get(0), a.get(a.size() - 1));

        bufferedReader.close();
    }
}