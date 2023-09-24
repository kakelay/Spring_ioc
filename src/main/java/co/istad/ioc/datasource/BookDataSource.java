package co.istad.ioc.datasource;

import co.istad.ioc.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class BookDataSource {
    private List<Book> books;

    @Bean("generateBooks")
    public List<Book> generateBook() {
        books = new ArrayList<>();
        books.add(new Book(1, "Java", "DevKH"));
        books.add(new Book(2, "Python", "DevKH"));
        books.add(new Book(3, "Flutter", "DevKH"));
        books.add(new Book(4, "C++", "DevKH"));
        books.add(new Book(5, "OOP", "DevKH"));
        return books;
    }
    @Bean("initialBooks")
    public List<Book> initialBooks(ArrayList<Book> books) {
        this.books = books;
        return this.books;
    }
}
