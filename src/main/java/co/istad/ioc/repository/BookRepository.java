package co.istad.ioc.repository;

import co.istad.ioc.datasource.BookDataSource;
import co.istad.ioc.model.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BookRepository {


    private List<Book> books;

    public BookRepository(@Qualifier("generateBooks") List<Book> books) {
        this.books = books;
    }

    public List<Book> findAll() {

        return books;
    }
}
