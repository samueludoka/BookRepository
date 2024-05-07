package org.applicationsmart.services;

import org.applicationsmart.data.model.Author;

import java.util.List;

public interface AuthorService {


    void save(String name, String birth_year, String death_year);
    void save(List<Author> authors);


}
