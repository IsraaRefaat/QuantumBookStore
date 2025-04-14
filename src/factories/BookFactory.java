package factories;


import book.Book;
import book.Buyable;
import book.EBook;
import book.PaperBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BookFactory implements Buyable {

    //I made it static to force all the diff implementations to use the same instance of this list
    static List<Book> books = new ArrayList<>();
    public enum BookType {PAPER , EBOOK , DEMO};


    //Because we will mainly have all the possible changes here,
    // so it'll be abstract so if we added audioBook then, it will remain the same here!
    public abstract void addBook(BookType type, Book book);



    public List<Book> removeBooks(int publisherYear) {

        List<Book> temp = new ArrayList<Book>();

        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getPublisherYear() <= publisherYear) {
                temp.add(book);
                iterator.remove();
            }

        }
        return temp;

    }

}
