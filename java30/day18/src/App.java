import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    private LinkedList<Character> queue;
    private Deque<Character> stack;

    public Solution() {
        this.queue = new LinkedList<>();
        this.stack = new ArrayDeque<>();
    }

    public boolean isPalindrome() {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            char chqueue = this.dequeueCharacter();
            char chstack = this.popCharacter();

            if (chqueue != chstack) {
                return false;
            }
        }
        return true;
    }

    public void pushCharacter(char ch) {
        this.stack.push(ch);
    }

    public char popCharacter() {
        return this.stack.pop();
    }

    public void enqueueCharacter(char ch) {
        this.queue.offer(ch);
    }

    public char dequeueCharacter() {
        return this.queue.poll();
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        char[] word = scan.nextLine().toCharArray();

        Solution solution = new Solution();
        for (char letter : word) {
            solution.enqueueCharacter(letter);
            solution.pushCharacter(letter);
        }

        if (solution.isPalindrome()) {
            System.out.printf("The word, %s, is a palindrome.%n", String.valueOf(word));
        } else {
            System.out.printf("The word, %s, is not a palindrome.%n", String.valueOf(word));
        }

        scan.close();
    }
}
