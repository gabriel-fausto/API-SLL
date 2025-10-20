package com.br.gfausto.sebo_livro_livro.book.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document(collection = "books")
public class Book {

    @Id
    private final String id;
    private final String title;
    private final String author;
    private final String category;
    private final String condition;
    private final String type;
    private final String description;

    @CreatedDate
    private LocalDateTime createdAt;
}
