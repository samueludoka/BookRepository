package org.applicationsmart.services;

import org.applicationsmart.data.model.Book;
import org.applicationsmart.data.model.GuntendexBook;
import org.applicationsmart.data.repository.BookSearchRepository;
import org.applicationsmart.exceptions.BookDoesNotExistException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class GutendexBookSearchServiceTest {

    @Autowired
    private BookSearchRepository bookSearchRepository;

    @Autowired
    private GutendexBookService gutendexBookService;

    @Test
    public void fetchFromApiTest() throws URISyntaxException {
        GuntendexBook guntendexBook = gutendexBookService.findBook2("frankenstein");
        assertNotNull(guntendexBook);

    } @Test
    public void fetchForBookNotFoundTest() throws URISyntaxException {
        assertThrows(BookDoesNotExistException.class, () -> gutendexBookService.findBook2("wrongbook"));
    }
}
