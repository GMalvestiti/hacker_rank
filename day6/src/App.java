import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String newStr = bufferedReader.readLine().trim();
            strs.add(newStr);
        }

        System.out.println("");
        for (String str : strs) {
            char[] charArray = str.toCharArray();

            str = " ";
            for (int j = 0; j < charArray.length; j++) {
                if ((j % 2) == 0) {
                    System.out.print(charArray[j]);
                } else {
                    str += charArray[j];
                }
            }
            str += "\n";
            System.out.print(str);
        }

        bufferedReader.close();
    }
}