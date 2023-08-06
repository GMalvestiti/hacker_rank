import java.util.Scanner;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class App {

    public static Node removeDuplicates(Node head) {
        Node current = head;
    
        while (current != null) {
            Node temp = current;

            while (temp.getNext() != null) {
                if (temp.getNext().getData() == current.getData()) {
                    temp.setNext(temp.getNext().getNext());
                } else {
                    temp = temp.getNext();
                }
            }
    
            current = current.getNext();
        }
    
        return head;
    }

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        return head;
    }

    public static void display(Node node) {
        while (node != null) {
            System.out.printf("%d ", node.getData());
            node = node.getNext();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Node head = null;
        while(n-- > 0) {
            int data = scan.nextInt();
            head = insert(head, data);
        }

        head = removeDuplicates(head);
        display(head);

        scan.close();
    }
}
