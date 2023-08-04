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

    public static int getHeight(Node node) {
        if (node == null) {
            return -1;
        }

        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
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

        System.out.println(getHeight(root));

        scan.close();
    }
}
