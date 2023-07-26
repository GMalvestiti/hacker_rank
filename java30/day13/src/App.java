import java.util.Scanner;

abstract class Book {
    String title;
    String author;
    int price;
    
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    abstract void display();
}

class MyBook extends Book {
    
    MyBook(String title, String author, int price) {
        super(title, author, price);
    }
    
    void display() {
        System.out.printf("Title: %s%nAuthor: %s%nPrice: %d", this.title, this.author, this.price);
    }
}

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        
        MyBook mb = new MyBook(title, author, price);
        mb.display();
        
        scan.close();
    }
}