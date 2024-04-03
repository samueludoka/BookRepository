package org.applicationsmart.services;

import lombok.AllArgsConstructor;
import org.applicationsmart.data.model.Book;
import org.applicationsmart.data.repository.BookRepository;
import org.applicationsmart.dtos.request.BookRequest;
import org.applicationsmart.dtos.response.BookResponse;
import org.applicationsmart.exceptions.BookDoesNotExistException;
import org.applicationsmart.util.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.applicationsmart.util.BookMapper.map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public void fetchBook(BookRequest bookRequest) {
        if (!foundBook(bookRequest.getBookTitle())) throw new BookDoesNotExistException(bookRequest.getBookTitle()+ " Book not found");
        Book book = map(bookRequest);
        bookRepository.save(book);
    }

    private boolean foundBook(String bookTitle) {
        Book foundBook = bookRepository.findBookByBookTitle(bookTitle);
        return foundBook != null;
    }


}
