package org.applicationsmart.data.repository;

import org.applicationsmart.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long>{
    Book findBookByBookTitle(String  bookTitle);
}
