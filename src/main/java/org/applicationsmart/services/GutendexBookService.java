package org.applicationsmart.services;

import org.applicationsmart.data.model.GuntendexBook;

import java.net.URISyntaxException;
import java.nio.file.Path;

public interface GutendexBookService {
    Path findBook(String title) throws URISyntaxException;
}
