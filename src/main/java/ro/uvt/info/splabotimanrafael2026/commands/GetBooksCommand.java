package ro.uvt.info.splabotimanrafael2026.commands;

import ro.uvt.info.splabotimanrafael2026.services.BooksService;
import java.util.List;

public class GetBooksCommand implements Command<List<String>> {
    private final BooksService booksService;

    public GetBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public List<String> execute() {
        return booksService.getAllBooks();
    }
}