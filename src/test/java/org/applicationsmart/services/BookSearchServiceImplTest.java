package org.applicationsmart.services;

import org.applicationsmart.data.repository.BookSearchRepository;
import org.applicationsmart.dtos.request.BookRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookSearchServiceImplTest {
    @Autowired
    private BookSearchService bookSearchService;
    @Autowired
    private BookSearchRepository repository;

    @Test
    public void testThatBookSearchSaveToRepository(){
        BookRequest bookRequest = new BookRequest();
        bookRequest.setBookTitle("frankenstein");
        bookRequest.setBookAurthur("");
    }

}