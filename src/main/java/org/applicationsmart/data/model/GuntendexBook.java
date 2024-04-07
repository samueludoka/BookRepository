package org.applicationsmart.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@ToString
@Getter
@Setter
@Entity
public class GuntendexBook {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private String title;
    @OneToMany
    private List<Author> authors;
    private String copyright;
    @OneToMany
    private List<Language> languages;
    @OneToMany
    private List<Book> books;
}
