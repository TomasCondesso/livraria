package com.estagiariontt.Livraria.repository;

import com.estagiariontt.Livraria.entity.Book;
import com.estagiariontt.Livraria.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

  // Book findByType(Long CategoryId);


}
