package com.labrador.test_java.service;
import com.labrador.test_java.model.Book;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Value("${book.api.url}")
    private String bookApiUrl;

    private final RestTemplate restTemplate;

    public BookService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<Book> getAllBooks(){
       Book[] books = restTemplate.getForObject(bookApiUrl, Book[].class);
       return Arrays.asList(books);
    }

   public List<Book> getBooksbyLanguage(String language){
        return getAllBooks().stream().filter(book -> book.getLanguage().equals(language)).collect(Collectors.toList());
   }

}
