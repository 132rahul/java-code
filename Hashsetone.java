import java.util.*;
import java.util.Iterator;

class Book{
    int id;
    String bookname;
    double price;
    public Book(int id, String bookname,double price){
        this.id=id;
        this.bookname=bookname;
        this.price=price;
    }
}
public class Hashsetone {
    public static void main(String agrs[]){
        Book b1=new Book(23,"r",  2.30);
        Book b2 =new Book(11,"a",234.23);
        HashSet<Book> h1=new HashSet<Book>();
        HashSet<String> h2=new HashSet<String>();
        h2.add("ppk rere");
        h2.add("ttk");
        h1.add(b1);
        h1.add(b2);
        Iterator it=h1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Book b:h1){
            System.out.println(b.id + " " + b.bookname + " " + b.price);
        }
    }
}
