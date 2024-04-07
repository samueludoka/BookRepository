package org.applicationsmart.services;

import lombok.AllArgsConstructor;
import org.applicationsmart.data.model.Book;
import org.applicationsmart.data.repository.BookSearchRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookSearchServiceImpl implements BookSearchService{

    private final BookSearchRepository bookSearchRepository;
    @Override
    public String findByTitle(String title) {
        String book = bookSearchRepository.findBookByBookTitle(title).getBookTitle();
        return book;
    }

    @Override
    public void save(Book book) {
        bookSearchRepository.save(book);

    }
}
