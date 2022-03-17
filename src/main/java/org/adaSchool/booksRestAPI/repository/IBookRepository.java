package org.adaSchool.booksRestAPI.repository;

import org.adaSchool.booksRestAPI.repository.model.Book;

import java.util.Optional;

public interface IBookRepository {

    Book create(Book book);
    Optional<Book> getById(String id);
    Optional<Book> update(Book book);
    Optional<Book> delete(String id);
}
