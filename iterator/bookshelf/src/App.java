import ConcreteAggregate.BookShelf;
import Iterator.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Book 1");
        bookShelf.addBook("Book 2");
        bookShelf.addBook("Book 3");

        Iterator iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());           
        }
    }
}
