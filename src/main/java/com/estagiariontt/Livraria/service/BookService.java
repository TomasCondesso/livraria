package com.estagiariontt.Livraria.service;

import com.estagiariontt.Livraria.entity.Book;
import com.estagiariontt.Livraria.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estagiariontt.Livraria.repository.BookRepository;

import java.util.List;

@Service
@Slf4j
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        log.info("Inside saveLivraria method of BookService.");
        return bookRepository.save(book);
    }

    public Book findBookById(Long BookId) {
        log.info("Inside saveBook method of findBookById.");
        //return bookRepository.findByBookId(BookId);
        return bookRepository.getById(BookId);
    }

    public List<Book> bookList() {
        log.info("Inside bookList method of CategoryService.");
        return bookRepository.findAll();
    }

    public void bookDelete(Long bookId) {
        log.info("Inside bookDelete method of CategoryService.");
        bookRepository.deleteById(bookId);
    }

    /*public Book updateBook(Long BookId, Book book){
        log.info("Inside updateBook method of findBookById.");
        return bookRepository.;
    }*/

}
