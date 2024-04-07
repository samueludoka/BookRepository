package org.applicationsmart.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class ReadingList {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String id;

    @OneToMany
    private List<Book> bookList;
}
