package org.applicationsmart.services;

import org.applicationsmart.data.model.Book;

public interface BookSearchService {
    String findByTitle(String title);
    void save(Book book);
}
