package ro.uvt.info.splabotimanrafael2026.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uvt.info.splabotimanrafael2026.Book;
import ro.uvt.info.splabotimanrafael2026.persistence.CrudRepository;

import java.util.List;

@Service
public class BooksService {
    private final CrudRepository<Book, Long> crudRepository;

    @Autowired
    public BooksService(CrudRepository<Book, Long> crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Book> getAllBooks() {
        return crudRepository.findAll();
    }

    public Book addBook(Book book) {
        return crudRepository.save(book);
    }
}