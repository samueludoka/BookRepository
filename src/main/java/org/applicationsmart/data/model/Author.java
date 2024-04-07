package org.applicationsmart.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Author {
    @Id
    private Long id;
    private String name;
    private String birth_year;
    private String death_year;
}
