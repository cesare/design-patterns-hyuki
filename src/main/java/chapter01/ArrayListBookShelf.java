package chapter01;

import java.util.ArrayList;

public class ArrayListBookShelf extends BookShelf implements Aggregate {
    private ArrayList<Book> books;
    
    public ArrayListBookShelf(int initialCapacity) {
        super(0);
        books = new ArrayList<Book>(initialCapacity);
    }
    
    @Override
    public Book getBookAt(int index) {
        return books.get(index);
    }
    
    @Override
    public void appendBook(Book book) {
        books.add(book);
    }
    
    @Override
    public int getLength() {
        return books.size();
    }
    
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
