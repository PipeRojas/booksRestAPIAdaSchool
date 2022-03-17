package org.adaSchool.booksRestAPI.repository;

import org.adaSchool.booksRestAPI.repository.model.Book;

import java.util.HashMap;
import java.util.Optional;

public class BookRepositoryMap implements IBookRepository{
    private final HashMap<String, Book> booksMap = new HashMap<>();
    @Override
    public Book create(Book book) {
        return (Book) booksMap.put(book.getId(), book);
    }

    @Override
    public Optional<Book> getById(String id) {
        return Optional.of(booksMap.get(id));
    }

    @Override
    public Optional<Book> update(Book book) {
        return Optional.ofNullable(booksMap.put(book.getId(), book));
    }

    @Override
    public Optional<Book> delete(String id) {
        return Optional.of(booksMap.remove(id));
    }
}
