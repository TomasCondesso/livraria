package com.estagiariontt.Livraria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor //lombok
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;



    @ManyToMany(mappedBy = "categories")
    private Collection<Book> books;

    private String name;
    private String description;

    /*public Set<Book> getBookSet_Cat() {
        return books;
    }*/

}
