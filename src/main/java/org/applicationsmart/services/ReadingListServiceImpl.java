package org.applicationsmart.services;

import org.applicationsmart.data.model.Book;
import org.applicationsmart.data.model.GuntendexBook;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class ReadingListServiceImpl implements ReadingListService{
    private final ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private BookSearchService bookSearchService;
    @Autowired
    GutendexBookService gutendexBookService;


    @Override
    public void AddBookToList(String title) throws URISyntaxException {
        GuntendexBook book = (GuntendexBook) gutendexBookService.findBook(title);
        Book book1 = modelMapper.map(book,Book.class);

        bookSearchService.save(book1);
    }
}
