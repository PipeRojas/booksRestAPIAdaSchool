package org.adaSchool.booksRestAPI.repository;

import org.adaSchool.booksRestAPI.repository.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
@Service
public class BookRepositoryArray implements IBookRepository{
    private final List<Book> bookList = new ArrayList<>();
    @Override
    public Book create(Book book) {
        if(!bookList.contains(book)){
            bookList.add(book);
        }
        return book;
    }

    @Override
    public Optional<Book> getById(String id) {
        return bookList.stream().filter(book -> (book.getId().equals(id))).findFirst();
    }

    @Override
    public Optional<Book> update(Book book) {
        Optional<Book> actualBook;
        if((actualBook = getById(book.getId())).isPresent()){
            bookList.remove(actualBook.get());
            bookList.add(book);
        }
        return Optional.of(book);
    }

    @Override
    public Optional<Book> delete(String id) {
        Optional<Book> actualBook;
        if((actualBook = getById(id)).isPresent()){
            bookList.remove(actualBook.get());
        }
        return actualBook;
    }
}
