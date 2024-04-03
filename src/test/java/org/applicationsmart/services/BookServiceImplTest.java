package org.applicationsmart.services;

import org.applicationsmart.data.repository.BookRepository;
import org.applicationsmart.dtos.request.BookRequest;
import org.applicationsmart.dtos.response.BookResponse;
import org.applicationsmart.exceptions.BookDoesNotExistException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class BookServiceImplTest {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookRepository bookRepository;
    @Test
    public void testThatBookCanBeSearchedOnUrlAddress(){
        BookRequest bookRequest = new BookRequest();
        bookRequest.setBookTitle("naked weapon");
        bookRequest.setUrlAddress("https://gutendex.com/books");
        bookService.fetchBook(bookRequest);
        assertEquals(2,bookRepository.count());
      //  assertThrows(BookDoesNotExistException.class,() -> bookService.fetchBook(bookRequest));
    }

}