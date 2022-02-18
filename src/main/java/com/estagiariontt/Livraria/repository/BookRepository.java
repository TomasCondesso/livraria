package com.estagiariontt.Livraria.repository;

import com.estagiariontt.Livraria.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByBookId(Long BookId);
    List<Book> findByTitle(String title);
    List<Book> findByScore(Long score);
    List<Book> findByTitleAndScore(String title, Long score);
}
