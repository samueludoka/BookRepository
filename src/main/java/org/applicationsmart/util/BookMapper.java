package org.applicationsmart.util;

import org.applicationsmart.data.model.Book;
import org.applicationsmart.dtos.request.BookRequest;

public class BookMapper {
    public static Book map(BookRequest bookRequest){
        Book book = new Book();
        book.setBookTitle(bookRequest.getBookTitle());
        book.setUrlAddress(bookRequest.getUrlAddress());
        return book;
    }
}
