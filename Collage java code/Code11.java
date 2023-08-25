
/*
 * Design a class BookShop with the following details 
 *  private Vector bookshelf that will store only Book objects addBook(Book b) inserts a book to bookshelf 
 *  addBook(Book b, int i) inserts book b at location i to bookshelf removeBook(Book b) removes a book from 
 *  bookShelf removeBook(int i)  removes book I from bookshelf show() displays all books in the bookshelf 
 *  sort () sorts all books according to the title
 */

// import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Code11 {

    public static void main(String[] args) {
        List<Book> list = new Vector<>();
        Book b1 = new Book("phy");
        Book b2 = new Book("che");
        list.add(b1);
        list.add(b2);
        show(list);
        list.remove(b1);
        // Collections.sort((List<T>) list);
    }

    static void show(List<Book> list){
        System.out.println(list);
    }
    
}

class Book {
    String title;
    int position;

    Book(String title) {
        this.title = title;
    }

    Book(String title, int position) {
        this.title = title;
        this.position = position;
    }

    @Override
    public String toString() {
        return this.title;
    }
}