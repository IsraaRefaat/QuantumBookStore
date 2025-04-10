package book;

public class EBook extends Book{

    private double price;
    private String fileType;

    public EBook(int ISBN, String title, int publisherYear, double price, String fileType) {
        super(ISBN, title, publisherYear);
        this.price = price;
        this.fileType = fileType;
    }

    public double getPrice() {
        return price;
    }

    public String getFileType() {
        return fileType;
    }

}
