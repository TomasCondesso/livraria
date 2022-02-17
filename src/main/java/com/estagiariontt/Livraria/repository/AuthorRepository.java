package com.estagiariontt.Livraria.repository;

import com.estagiariontt.Livraria.entity.Author;
import com.estagiariontt.Livraria.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    //Book findByName(Long AuthorId);

}
