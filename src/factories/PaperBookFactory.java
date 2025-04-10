package factories;

import book.Book;

import java.util.List;

public class PaperBookFactory extends BookFactory {


    @Override
    public void addBook(BookType type, Book book) {
        if(type.equals(BookType.PAPER)) {
            books.add(book);
        }
    }


}
