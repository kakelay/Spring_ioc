package co.istad.ioc.controller;

import co.istad.ioc.model.Book;
import co.istad.ioc.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private BookRepository bookRepository;

    public BookController( BookRepository bookRepository) {
        this.bookRepository =  bookRepository;
    }

    @GetMapping("/books")
    List<Book> findAll() {
        return bookRepository.findAll();
    }
}
