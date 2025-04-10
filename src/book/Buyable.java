package book;

import services.MailService;
import services.ShippingService;

public interface Buyable {

    //or we will make autowired || will make the method itself static method
    ShippingService shippingService = new ShippingService();
    MailService mailService = new MailService();

    //buy single book
    public default double buyBook(Book book) throws Exception {

        if(book instanceof PaperBook){
            if(((PaperBook) book).getQuantity()>0){
                double price = ((PaperBook) book).getPrice();
                ((PaperBook) book).setQuantity(((PaperBook) book).getQuantity()-1);
                shippingService.ship(book);
                return price;
            }
            else{
                throw new Exception("Not Enough Quantity");
            }

        }

        else if(book instanceof EBook)
        {
            //dummy user obj
            Object user = new Object();

            mailService.sendMail(user,book);

            return  ((EBook) book).getPrice();
        }

        else{
            throw new Exception("This Book not for sale");
        }

    }

}
