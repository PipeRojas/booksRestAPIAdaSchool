package org.adaSchool.booksRestAPI.controller;

import org.adaSchool.booksRestAPI.controller.dto.BookDto;
import org.adaSchool.booksRestAPI.repository.IBookRepository;
import org.adaSchool.booksRestAPI.repository.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    private final IBookRepository bookRepository;

    public BookController(@Autowired IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book create(@RequestBody BookDto bookDto ){
        return bookRepository.create( new Book( bookDto ) );
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable String id ){
        return bookRepository.getById( id );
    }

    @PutMapping("/{id}")
    public Optional<Book> update( @PathVariable String id, @RequestBody BookDto bookDto ){
        return bookRepository.update( new Book( bookDto ) );
    }

    @DeleteMapping("/{id}")
    public Optional<Book> update( @PathVariable String id ){
        return bookRepository.delete( id );
    }
}
