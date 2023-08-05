import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class App {

    public static void levelOrder(Node node) {
        if (node == null) {
            System.out.print("");
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.printf("%d ", currentNode.getData());

            if (currentNode.getLeft() != null) {
                queue.offer(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.offer(currentNode.getRight());
            }
        }
    }

    public static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data, null, null);
        }

        if (data < node.getData()) {
            node.setLeft(insert(node.getLeft(), data));
        } 
        
        if (data > node.getData()) {
            node.setRight(insert(node.getRight(), data));
        }

        return node;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Node root = null;
        while (n-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }

        levelOrder(root);

        scan.close();
    }
}
