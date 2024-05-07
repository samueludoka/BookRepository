package org.applicationsmart.data.repository;

import org.applicationsmart.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookSearchRepository extends JpaRepository<Book, Long> {

    Book findBookByTitle(String title);
}
