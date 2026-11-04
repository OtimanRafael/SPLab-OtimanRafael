package ro.uvt.info.splabotimanrafael2026.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {
    private final List<String> books = new ArrayList<>();

    public BooksService() {
        books.add("Enciclopedia Fenomenelor Inexplicabile");
    }

    public List<String> getAllBooks() {
        return books;
    }
}