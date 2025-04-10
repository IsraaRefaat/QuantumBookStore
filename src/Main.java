//Author: Esraa Refaat Kassem
//Start: 7.15PM
//Finished: 8:11PM

import book.Book;
import book.DemoBook;
import book.EBook;
import book.PaperBook;
import factories.BookFactory;
import factories.DemoBookFactory;
import factories.EBookFactory;
import factories.PaperBookFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        //We got some books  in our factory wow!!
        PaperBook scienceBook = new PaperBook(142002,"Quantum Physics",2020,250,20);
        EBook loveStory = new EBook(1234,"Lila",2024,100,"pdf");
        DemoBook designPatterns = new DemoBook(1478,"Java Design Pattern",2015);



        //Let's call our paper Factory to store them
        BookFactory paperBookFactory =  new PaperBookFactory();
        paperBookFactory.addBook(BookFactory.BookType.PAPER,scienceBook);

        //Let's call our EBook Factory to store them
        BookFactory EbookFactory =  new EBookFactory();
        EbookFactory.addBook(BookFactory.BookType.EBOOK,loveStory);

        //Let's call our DemoBook Factory to store them
        BookFactory demoBookFactory = new DemoBookFactory();
        demoBookFactory.addBook(BookFactory.BookType.DEMO,designPatterns);


        //Now let's now try our remove method
        List<Book> removedBooks=paperBookFactory.removeBooks(2020);
        System.out.println(removedBooks);

        //Now we will try our final method which is buy()
        System.out.println(paperBookFactory.buyBook(scienceBook));
        System.out.println(EbookFactory.buyBook(loveStory));
        System.out.println(demoBookFactory.buyBook(designPatterns));


    }
}