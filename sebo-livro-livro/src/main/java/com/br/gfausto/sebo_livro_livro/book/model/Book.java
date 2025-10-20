package com.br.gfausto.sebo_livro_livro.book.model;

import java.util.Date;

public class Book {
    public Book() {
        this.id = 0;
        this.title = "";
        this.author = "";
        this.category = "";
        this.condition = "";
        this.type = "";
        this.description = "";
        this.createdAt = new Date();
    }

    public Book(int id, String title, String author, String category, String condition, String type, String description, Date createdAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.condition = condition;
        this.type = type;
        this.description = description;
        this.createdAt = createdAt;
    }


    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getCondition() {
        return condition;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    private final int id;
    private final String title;
    private final String author;
    private final String category;
    private final String condition;
    private final String type;
    private final String description;
    private final Date createdAt;
}
