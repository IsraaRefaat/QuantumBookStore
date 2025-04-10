package book;

public abstract class Book {
    private long ISBN;
    private String title;
    private int publisherYear;

    public Book(long ISBN, String title, int publisherYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.publisherYear = publisherYear;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisherYear() {
        return publisherYear;
    }
}
