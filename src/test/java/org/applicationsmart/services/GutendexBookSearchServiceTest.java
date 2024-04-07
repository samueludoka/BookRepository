package org.applicationsmart.services;

import org.applicationsmart.data.model.Book;
import org.applicationsmart.data.model.GuntendexBook;
import org.applicationsmart.data.repository.BookSearchRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


@SpringBootTest
public class GutendexBookSearchServiceTest {

    @Autowired
    private BookSearchRepository bookSearchRepository;

    @Autowired
    private GutendexBookService gutendexBookService;

    @Test
    public void fetchFromApiTest() throws URISyntaxException {
        Path guntendexBook = gutendexBookService.findBook("frankenstein");
        assertNotNull(guntendexBook);


//        String encodedSearchQuery = URLEncoder.encode("Frankenstein", StandardCharsets.UTF_8);
//        String uriString = "https://gutendex.com/books?search=" + encodedSearchQuery;
//        URI uri = new URI(uriString);

    }
}
