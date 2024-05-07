package org.applicationsmart.services;

import org.applicationsmart.data.model.Author;
import org.applicationsmart.data.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    private AuthorRepository repository;

    @Override
    public void save(String name, String birth_year, String death_year) {
        Author author = new Author(name, birth_year, death_year);
        repository.save(author);
    }

    @Override
    public void save(List<Author> authors) {
        repository.saveAll(authors);
    }


}
