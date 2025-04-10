package factories;

import book.Book;

import java.util.List;

public class EBookFactory extends BookFactory {
    @Override
    public void addBook(BookType type, Book book) {
        if(type.equals(BookType.EBOOK)) {
            books.add(book);
        }
    }


}
