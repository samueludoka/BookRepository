package org.applicationsmart.services;

import org.applicationsmart.data.model.Author;
import org.applicationsmart.data.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AuthorServiceTest {
    @Autowired
    private AuthorService authorService;
    @Autowired
    private AuthorRepository repository;
    @Test
    public void testSaveAuthor(){
        List<Author> authors = List.of(new Author("mokey", "10-19-2004", "20-12-2004"));
        authorService.save(authors);
        assertEquals(repository.count(), 1);
    }

    @Test
    public void testAuthor(){
        authorService.save("monkey", "1200", "1900");
        assertEquals(repository.count(), 1);
    }

}