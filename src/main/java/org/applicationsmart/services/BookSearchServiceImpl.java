package org.applicationsmart.services;

import lombok.AllArgsConstructor;
import org.applicationsmart.data.model.Book;
import org.applicationsmart.data.model.GuntendexBook;
import org.applicationsmart.data.repository.BookSearchRepository;
import org.applicationsmart.exceptions.BookDoesNotExistException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookSearchServiceImpl implements BookSearchService{


    private final BookSearchRepository bookSearchRepository;
    private final GutendexBookService gutendexBookService;
    private final AuthorService authorService;
    private final ModelMapper mapper = new ModelMapper();
    @Override
    public String findByTitle(String title) {
        GuntendexBook guntendexBook = new GuntendexBook();
       Book foundBook = bookSearchRepository.findBookByTitle(title);
       if(!bookExist(title))throw new BookDoesNotExistException("Book with title" + title);
       Book book = mapper.map(guntendexBook, Book.class);
       authorService.save(book.getAuthors());
       bookSearchRepository.save(book);
       return "Book added successfully";
    }

    private boolean bookExist(String title) {
        return false;
    }

    @Override
    public void save(Book book) {
        bookSearchRepository.save(book);
    }
}
