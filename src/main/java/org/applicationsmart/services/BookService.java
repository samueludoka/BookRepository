package org.applicationsmart.services;

import org.applicationsmart.dtos.request.AddBookRequest;
import org.applicationsmart.dtos.response.AddBookResponse;

public interface AddBookService {
    AddBookResponse fetchBook(AddBookRequest addBookRequest);
}
