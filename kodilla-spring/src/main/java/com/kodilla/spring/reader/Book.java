package com.kodilla.spring.reader;

import org.springframework.stereotype.Service;

@Service
public final class Book {
    final String title;

    public Book(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}