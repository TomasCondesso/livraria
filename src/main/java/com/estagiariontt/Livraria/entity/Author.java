package com.estagiariontt.Livraria.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor //lombok
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long authorId;


    @JsonIgnore
    @ManyToMany(mappedBy = "authors")
    private Set<Book> bookSet_Aut;

    public String name;
    public Long birth_year;
    public String nationality;

    /*public Set<Book> getBookSet_Aut() {
        return bookSet_Aut;
    }*/
}
