package com.estagiariontt.Livraria.controller;

import com.estagiariontt.Livraria.entity.Author;
import com.estagiariontt.Livraria.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.estagiariontt.Livraria.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/book")
@Slf4j
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/author/")
    public Author saveAuthor(@RequestBody Author author){
        log.info("Inside saveBook method of BookController.");
        return authorService.saveAuthor(author);
    }

    @GetMapping("/author/{id}")
    public Author findAuthorById(@PathVariable("id") Long AuthorId){
        log.info("Inside findAuthorById method of AuthorController");
        return authorService.findAuthorById(AuthorId);
    }

    @GetMapping("/author")
    public List<Author> allAuthors(){
        log.info("Inside allAuthors method of AuthorController.");
        return authorService.authorList();
    }

    @DeleteMapping("/author_delete/{id}")
    public void deleteAuthor(@PathVariable("id") Long AuthorId){
        log.info("Inside deleteAuthor method of AuthorController.");
        authorService.authorDelete(AuthorId);
    }
}
