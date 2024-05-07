package org.applicationsmart.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Author {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String birth_year;
    private String death_year;

    public Author(String name, String birth_year, String death_year) {
        this.birth_year = birth_year;
        this.death_year = death_year;
        this.name = name;
    }
}
