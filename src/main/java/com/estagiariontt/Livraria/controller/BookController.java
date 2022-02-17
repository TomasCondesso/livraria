package com.estagiariontt.Livraria.controller;

import com.estagiariontt.Livraria.entity.Book;
import com.estagiariontt.Livraria.entity.Category;
import com.estagiariontt.Livraria.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.estagiariontt.Livraria.service.BookService;

import javax.security.auth.Subject;
import java.util.List;

@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;
    private BookRepository bookRepository;

    @PostMapping("/")
    public Book saveBook(@RequestBody Book book){
        log.info("Inside saveBook method of BookController.");
        return bookService.saveBook(book);
    }

    @GetMapping("/{id}")
    public Book findBookById(@PathVariable("id") Long BookId){
        log.info("Inside findBookById method of BookController " + BookId);
        return bookService.findBookById(BookId);
    }

    @GetMapping("/")
    public List<Book> allBooks(@RequestParam String title){
        log.info("Inside allBooks method of BookController." + title);
        return bookService.bookList();
    }

    //TODO Triagem por titulo. Após isso fazer com os outros parametros.

    @DeleteMapping("/book_delete/{id}")
    public void deleteCategory(@PathVariable("id") Long BookId){
        log.info("Inside allCategories method of CategoryController.");
        bookService.bookDelete(BookId);
    }

/*
    @PutMapping("/{id}/categories/{categoryId}")
    Book enrollCategorytoBook(
            @PathVariable Long bookId,
            @PathVariable Long categoryId
    ){}

    public Book updateBook(@PathVariable("id") Long BookId, @RequestBody Book book){
        return bookService.updateBook(BookId, book);
    }

    @DeleteMapping ("/delete/{id}")
    public Book deleteBookById(@PathVariable("id") Long BookId){

    }*/

}
