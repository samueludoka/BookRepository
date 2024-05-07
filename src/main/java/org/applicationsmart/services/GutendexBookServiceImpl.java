package org.applicationsmart.services;

import lombok.AllArgsConstructor;
import org.applicationsmart.data.model.Book;
import org.applicationsmart.dtos.response.BookSearchResponse;
import org.applicationsmart.data.model.GuntendexBook;
import org.applicationsmart.exceptions.BookDoesNotExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@AllArgsConstructor
public class GutendexBookServiceImpl implements GutendexBookService {
    @Override
    public GuntendexBook findBook2(String title){
        String encodedSearchQuery = URLEncoder.encode(title, StandardCharsets.UTF_8);
        String uriString = "https://gutendex.com/books/?search=" +title;
        URI uri = URI.create(uriString);


//        String url = "https:// gutendex.com/books?search=" + title;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BookSearchResponse> response = restTemplate.getForEntity(uriString, BookSearchResponse.class);
        BookSearchResponse response1 = response.getBody();
        if (response1.getResults().isEmpty()){
            throw new BookDoesNotExistException("Book not found");
        }
        GuntendexBook book = response1.getResults().getFirst();
//        bookSearchService.save(book.getBooks().get(0));
        System.out.println(book);
        return book;
    }
//        import org.springframework.web.client.RestTemplate;
//import java.net.URI;
//import java.net.URLEncoder;
//import java.nio.charset.StandardCharsets;

//        public GuntendexBook findBook(String title) {
//            try {
//                encodedSearchQuery = URLEncoder.encode(title, StandardCharsets.UTF_8);
//                uriString = "https://gutendex.com/books/?search=" + encodedSearchQuery;
//                uri = new URI(uriString);
//
//                RestTemplate restTemplate = new RestTemplate();
//                BookSearchResponse response = restTemplate.getForObject(uri, BookSearchResponse.class);
//
//                if (response != null && !response.getNext()) {
//                    GuntendexBook book = response.getResults().get(0);
//                    bookSearchService.save(book.getBooks().get(0));
//                    return book;
//                } else {
//                    // Handle case where no book is found
//                    return null;
//                }
//            } catch (Exception e) {
//                // Handle any exceptions, such as URISyntaxException or others
//                e.printStackTrace(); // or log the exception
//                return null;
//
//        return null;
//    }
//    import org.springframework.web.client.RestTemplate;
//import java.net.URI;
//import java.net.URLEncoder;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

//    public Path findBook(String title) {
//        try {
//            String encodedSearchQuery = URLEncoder.encode(title, StandardCharsets.UTF_8);
//            String uriString = "https://gutendex.com/books/?search=" + encodedSearchQuery;
//            URI uri = new URI(uriString);
//
//            RestTemplate restTemplate = new RestTemplate();
//            byte[] jsonResponse = restTemplate.getForObject(uri, byte[].class);
//
//            // Specify the directory where you want to save the file
//            Path directory = Paths.get("C:\\Users\\Samuel\\Desktop\\bookLibrary\\src\\main\\java\\org\\applicationsmart\\data\\repository\\BookRepository.java");
//            // Create the directory if it doesn't exist
//            Files.createDirectories(directory);
//            // Specify the file name
//            Path filePath = directory.resolve("response.json");
//            // Write the JSON content to the file
//            Files.write(filePath, jsonResponse);
//            Book book = (Book) filePath;
//            bookSearchService.save(book);
//            System.out.println(filePath);
//
//            return filePath;
//        } catch (Exception e) {
//            // Handle any exceptions, such as URISyntaxException or others
//            e.printStackTrace(); // or log the exception
//            return null;
//        }
//    }


}

