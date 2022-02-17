package com.estagiariontt.Livraria.service;

import com.estagiariontt.Livraria.entity.Author;
import com.estagiariontt.Livraria.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estagiariontt.Livraria.repository.AuthorRepository;

import java.util.List;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        log.info("Inside saveCategory method of CategoryService.");
        return authorRepository.save(author);
    }

    public Author findAuthorById(Long AuthorId) {
        log.info("Inside saveCategory method of findCategoryById.");
        //return bookRepository.findByBookId(BookId);
        return authorRepository.getById(AuthorId); //Tenho que alterar o id
    }

    public List<Author> authorList() {
        log.info("Inside allCategory method of CategoryService.");
        return authorRepository.findAll();
    }

    public void authorDelete(Long authorId) {
        log.info("Inside categoryDelete method of CategoryService.");
        authorRepository.deleteById(authorId);
    }
}
