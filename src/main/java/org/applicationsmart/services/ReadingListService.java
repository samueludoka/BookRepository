package org.applicationsmart.services;

import java.net.URISyntaxException;

public interface ReadingListService {
    void AddBookToList(String title) throws URISyntaxException;
}
