package com.br.gfausto.sebo_livro_livro.book.repository;

import com.br.gfausto.sebo_livro_livro.book.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
