package ro.uvt.info.splabotimanrafael2026.commands;

import ro.uvt.info.splabotimanrafael2026.Book;
import ro.uvt.info.splabotimanrafael2026.services.BooksService;
import java.util.List;

public class GetBooksCommand implements Command<List<Book>> {
    private final BooksService booksService;

    public GetBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public List<Book> execute() {
        return booksService.getAllBooks();
    }
}