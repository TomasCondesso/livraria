package com.estagiariontt.Livraria.service;

import com.estagiariontt.Livraria.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estagiariontt.Livraria.repository.CategoryRepository;

import java.util.List;

@Service
@Slf4j
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        log.info("Inside saveCategory method of CategoryService.");
        return categoryRepository.save(category);
    }

    public Category findCategoryById(Long CategoryId) {
        log.info("Inside saveCategory method of findCategoryById.");
        //return bookRepository.findByBookId(BookId);
        return categoryRepository.getById(CategoryId);
    }

    public List<Category> categoryList() {
        log.info("Inside allCategory method of CategoryService.");
        return categoryRepository.findAll();
    }

    public void categoryDelete(Long CategoryId) {
        log.info("Inside categoryDelete method of CategoryService.");
        categoryRepository.deleteById(CategoryId);
    }
}
