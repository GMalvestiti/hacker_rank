import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

public class App {

    public static <T> T[] convertListToArray(List<T> elements) {
        Class<?> elementType = elements.get(0).getClass();
        T[] array = (T[]) Array.newInstance(elementType, elements.size());

        for (int i = 0; i < elements.size(); i++) {
            array[i] = elements.get(i);
        }

        return array;
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            List<Object> elements = new ArrayList<>();
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                Object element = scan.next();
                elements.add(element);
            }

            Object[] array = convertListToArray(elements);
            App.printArray(array);
        }

        scan.close();
    }
}
