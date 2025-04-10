package factories;

import book.Book;

import java.util.List;

public class DemoBookFactory extends BookFactory {
    @Override
    public void addBook(BookType type, Book book) {
        if(type.equals(BookType.DEMO)) {
            books.add(book);
        }
    }


}
