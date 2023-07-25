import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = scanner.nextInt();
        }

        Student student = new Student(firstName, lastName, idNumber, scores);

        System.out.printf("Name: %s, %s%nID: %d%nGrade: %c", student.getLastName(), student.getFirstName(), student.getIdNumber(), student.calculate());

        scanner.close();
    }
}
