package com.br.gfausto.sebo_livro_livro.book.service;

import com.br.gfausto.sebo_livro_livro.book.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks() {
        return  new ArrayList<Book>();
    }

    public Book getBook(int id) {
        return new Book();
    }

    public Book addBook(Book book) {
        return book;
    }

    public Book updateBook(int id, Book book) {
        return book;
    }

    public void deleteBook(int id) {

    }
}
