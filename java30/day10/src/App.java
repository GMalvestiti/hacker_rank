import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binary = "";

        // binary = Integer.toBinaryString(n);
        for (int aux = n; aux > 0; aux = aux / 2) {
            int remainder = aux % 2;
            binary = String.valueOf(remainder) + binary;
        }

        int max = 0;
        int sequence = 0;
        char[] charArray = binary.toCharArray();
        for (char number : charArray) {
            if (number == '1') {
                sequence++;
                if (sequence > max) {
                    max = sequence;
                }
            } else {
                sequence = 0;
            }
        }

        System.out.println(max);

        bufferedReader.close();
    }
}
