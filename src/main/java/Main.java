import com.korki.lesson3.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Book lordOfTheRings = new Book("Lord of the Rings", 10 , "EN");
        Book godfather = new Book("Godfather", 100 , "IT");
        Book panTadeusz = new Book("Pan Tadeusz", 200 , "PL");


        List<Book> books = new ArrayList<Book>();

        books.add(lordOfTheRings);
        books.add(godfather);
        books.add(panTadeusz);

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getNumberOfPages() > 200) {

            } else {

            }
        }

    }
}
