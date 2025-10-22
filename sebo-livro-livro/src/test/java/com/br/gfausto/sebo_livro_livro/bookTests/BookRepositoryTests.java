package com.br.gfausto.sebo_livro_livro.bookTests;

import com.br.gfausto.sebo_livro_livro.book.model.Book;
import com.br.gfausto.sebo_livro_livro.book.repository.BookRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookRepositoryTests {

    @Autowired
    private BookRepository bookRepository;

    private static String orderID;

    @Test
    @Order(1)
    public void testCreateBook() {
        Book book = Book.builder()
                .title("Assassinato na academia brasileira de letras")
                .author("Jô Soares")
                .category("Romance Policial")
                .condition("novo")
                .type("troca")
                .description("um livro bem bacana").build();

        book = bookRepository.save(book);

        assertNotNull(book.getId());
        assertNotNull(book.getCreatedAt());
        assertEquals("troca", book.getType());

        orderID = book.getId();
    }

    @Test
    @Order(2)
    public void findBook() {
        Optional<Book> achou =  bookRepository.findById(orderID);

        assertTrue(achou.isPresent());
        assertEquals("novo", achou.get().getCondition());
    }

    @Test
    @Order(3)
    public void findByCondition() {
        List<Book> newBooks = bookRepository.findByCondition("novo");

        assertFalse(newBooks.isEmpty());
        newBooks.forEach(book -> {
            assertNotNull(book.getId());
            assertNotNull(book.getCreatedAt());
            assertEquals("novo", book.getCondition());
        });

    }

    @Test
    @Order(4)
    public void findByType() {
        List<Book> exchangeBooks = bookRepository.findByType("troca");

        assertFalse(exchangeBooks.isEmpty());
        exchangeBooks.forEach(book -> {
            assertNotNull(book.getId());
            assertNotNull(book.getCreatedAt());
            assertEquals("troca", book.getType());
        });
    }

    @Test
    @Order(5)
    public void updateBook () {
        Optional<Book> book = bookRepository.findById(orderID);

        assertTrue(book.isPresent());
        book.get().setCondition("usado");
        Book saved = bookRepository.save(book.get());

        assertEquals("usado", saved.getCondition());
    }

    @Test
    @Order(6)
    public void deleteBook() {
        bookRepository.deleteById(orderID);
        Book book = bookRepository.findById(orderID).orElse(null);
        assertNull(book);
    }
}
