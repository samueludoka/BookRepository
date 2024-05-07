package org.applicationsmart.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;
import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private Long id;
    private String title;
    @OneToMany(cascade = {MERGE})
    private List<Author> authors;
    private String copyright;
    @ElementCollection
    private List<String> languages;
    @ElementCollection
    private List<String> subjects;
}
