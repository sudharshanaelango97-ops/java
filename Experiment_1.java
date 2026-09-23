Class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available:
    Book(int bookId, String title, String author,
         String category, double price, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }
    void displayBookDetails() {
        System.out.println("Book ID     : " + bookId);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Category    : " + category);
        System.out.println("Price       : " + price);
        System.out.println("Available   : " + available);
        System.out.println("-----------------------------");
    }
}
public class Experiment1 {
    public static void main(String[] args) {
        Book book1 = new Book( 101,"Silappadhikaram","Elangovadigal","Epic",1550.00,true);
        Book book2 = new Book(
            102,"Sila Nerangalil Sila Manithargal","Jeyakandhan","Short Story",450.00,false);
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
