package com.br.gfausto.sebo_livro_livro.book.controller;

import com.br.gfausto.sebo_livro_livro.book.model.Book;
import com.br.gfausto.sebo_livro_livro.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @PostMapping("/")
    public Book createBook(Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/")
    public Book updateBook(Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }
}
