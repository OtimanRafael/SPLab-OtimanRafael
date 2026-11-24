package ro.uvt.info.splabotimanrafael2026.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.uvt.info.splabotimanrafael2026.Book;
import java.util.List;

@Component
public class BooksRepositoryAdapter implements CrudRepository<Book, Long> {
    private final BooksRepository booksRepository;

    @Autowired
    public BooksRepositoryAdapter(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public Book save(Book entity) {
        return booksRepository.save(entity);
    }
}