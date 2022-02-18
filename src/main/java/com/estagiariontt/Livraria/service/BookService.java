package com.estagiariontt.Livraria.service;

import com.estagiariontt.Livraria.entity.Book;
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
        log.info("Inside findBookById method of BookService.");
        //return bookRepository.findByBookId(BookId);
        return bookRepository.getById(BookId);
    }

    public List<Book> bookLists(String title, Long score) {
        log.info("Inside bookList method of BookService.");
        if(score != null && (title == null || title.isEmpty())){
            return bookRepository.findByScore(score);
        }
        else if((title != null && !title.isEmpty()) && (score == null)){
            return bookRepository.findByTitle(title);
        }
        else if(title != null && !title.isEmpty() && score != null) {
            return bookRepository.findByTitleAndScore(title, score);
        }
            return bookRepository.findAll();
    }

    public void bookDelete(Long bookId) {
        log.info("Inside bookDelete method of BookService.");
        bookRepository.deleteById(bookId);
    }

/*
    public Book bookByTitle(String title) {
        log.info("Inside bookByTitle method of BookService.");
        return bookRepository.findByTitle(title);
    }



    public Book bookByScore(Long score) {
        log.info("Inside bookByTitle method of BookService.");
        return bookRepository.findByScore(score);
    }
*/

    /*public Book updateBook(Long BookId, Book book){
        log.info("Inside updateBook method of findBookById.");
        return bookRepository.;
    }*/

}
