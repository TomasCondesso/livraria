package com.estagiariontt.Livraria.repository;

import com.estagiariontt.Livraria.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByBookId(Long BookId);

}
