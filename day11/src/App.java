import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int rows = arr.size();
        int cols = arr.get(0).size();
        
        int maxSum = 0;

        for (int i = 0; i < (rows - 2); i++) {
            for (int j = 0; j < (cols - 2); j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j + 1);
                sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                
                if ((sum > maxSum) || ((i == 0) && (j == 0))) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);

        bufferedReader.close();
    }
}