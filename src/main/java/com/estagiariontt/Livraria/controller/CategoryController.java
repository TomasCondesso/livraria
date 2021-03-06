package com.estagiariontt.Livraria.controller;

import com.estagiariontt.Livraria.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.estagiariontt.Livraria.service.CategoryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books/categories")
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public Category saveCategory(@RequestBody Category category){
        log.info("Inside saveCategory method of CategoryController.");
        return categoryService.saveCategory(category);
    }

    @GetMapping("/{id}")
    public Category findCategoryById(@PathVariable("id") Long CategoryId){
        log.info("Inside findBookById method of BookController");
        return categoryService.findCategoryById(CategoryId);
    }

    @GetMapping("/")
    public List<Category> allCategories(){
        log.info("Inside allCategories method of CategoryController.");
        return categoryService.categoryList();
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long CategoryId){
        log.info("Inside allCategories method of CategoryController.");
        categoryService.categoryDelete(CategoryId);
    }


    //TODO:incluir endpoint para obter lista de categorias
}
