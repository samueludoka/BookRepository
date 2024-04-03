package org.applicationsmart.services;

import org.applicationsmart.data.model.AddBook;
import org.applicationsmart.dtos.request.AddBookRequest;
import org.applicationsmart.dtos.response.AddBookResponse;
import org.springframework.stereotype.Service;

@Service
public class AddBookServiceImpl implements AddBookService{

    @Override
    public AddBookResponse fetchBook(AddBookRequest addBookRequest) {
        AddBook addBook = new AddBook();
        addBook.setBookTitle(addBookRequest.getBookTitle());
        addBook.setUrlAddress(addBookRequest.getUrlAddress());
        AddBookResponse addBookResponse = new AddBookResponse();
        addBookResponse.getMessage();
        return addBookResponse;
    }
}
