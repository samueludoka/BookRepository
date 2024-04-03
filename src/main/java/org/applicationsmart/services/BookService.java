package org.applicationsmart.services;

import org.applicationsmart.data.model.Book;
import org.applicationsmart.dtos.request.BookRequest;
import org.applicationsmart.dtos.response.BookResponse;

public interface BookService {
    void fetchBook(BookRequest bookRequest);
}
