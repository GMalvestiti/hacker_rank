public class Student extends Person {
    private int idNumber;
    private int[] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName);
        this.idNumber = idNumber;
        this.scores = scores;
    }
    
    public char calculate() {
        int a = 0;
        for (int i = 0; i < this.scores.length; i++) {
            a += scores[i];
        }
        a /= this.scores.length;

        if (a >= 90) {
            return 'O';
        } else if (a >= 80) {
            return 'E';
        } else if (a >= 70) {
            return 'A';
        } else if (a >= 55) {
            return 'P';
        } else if (a >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int[] getScores() {
        return this.scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}