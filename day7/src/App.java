import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = (arr.size() - 1); i >= 0; i--) {
            if (i == (arr.size() - 1)) {
                System.out.print(arr.get(i));
            }  else {
                System.out.print(" " + arr.get(i));
            }
        }

        bufferedReader.close();
    }
}