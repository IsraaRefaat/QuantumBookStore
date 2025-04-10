package book;

public class PaperBook extends Book {

    private double price;
    private int quantity;

    public PaperBook(long ISBN, String title, int year, double price, int quantity) {
        super(ISBN,title,year);
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
