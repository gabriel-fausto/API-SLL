package com.br.gfausto.sebo_livro_livro.bookTests;

import com.br.gfausto.sebo_livro_livro.book.model.Book;
import com.br.gfausto.sebo_livro_livro.book.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testCreateBook() {
        Book book = Book.builder()
                .title("Assassinato na academia brasileira de letras")
                .author("Jô Soares")
                .category("Romance Policial")
                .condition("novo")
                .type("troca")
                .description("um livro bem bacana").build();

        book = bookRepository.save(book);
        System.out.println(book);
    }
}
