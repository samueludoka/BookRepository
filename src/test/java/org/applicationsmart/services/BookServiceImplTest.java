package org.applicationsmart.services;

import org.applicationsmart.dtos.request.AddBookRequest;
import org.applicationsmart.dtos.response.AddBookResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class AddBookServiceImplTest {
    @Autowired
    private AddBookService addBookService;
    @Test
    public void testThatBookCanBeSearchedOnUrlAddress(){
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setBookTitle("naked weapon");
        addBookRequest.setUrlAddress("https://gutendex.com/books");
        AddBookResponse addBookResponse = addBookService.fetchBook(addBookRequest);
        assertNotNull(addBookResponse);
    }

}