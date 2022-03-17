package org.adaSchool.booksRestAPI.repository.model;

import org.adaSchool.booksRestAPI.controller.dto.BookDto;

import java.math.BigInteger;
import java.util.Objects;
import java.util.UUID;

public class Book {

    private String id;
    private String ISBN;
    private String title;
    private String language;
    private BigInteger pagesQuantity;

    public Book() {
    }

    public Book(BookDto bookDto) {
        this(bookDto.getISBN(), bookDto.getTitle(), bookDto.getLanguage(), bookDto.getPagesQuantity());
    }

    public Book(String ISBN, String title, String language, BigInteger pagesQuantity) {
        this.id = UUID.randomUUID().toString();;
        this.ISBN = ISBN;
        this.title = title;
        this.language = language;
        this.pagesQuantity = pagesQuantity;
    }

    public String getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BigInteger getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(BigInteger pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(ISBN, book.ISBN) && Objects.equals(title, book.title) && Objects.equals(language, book.language) && Objects.equals(pagesQuantity, book.pagesQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ISBN, title, language, pagesQuantity);
    }
}
