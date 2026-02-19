package ConcreteAggregate;

import java.util.ArrayList;
import java.util.List;

import Aggregate.Collection;
import ConcreteIterator.BookShelfIterator;
import Iterator.Iterator;

public class BookShelf implements Collection {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }

    public List<String> getBooks() {
        return books;
    }
    
}
