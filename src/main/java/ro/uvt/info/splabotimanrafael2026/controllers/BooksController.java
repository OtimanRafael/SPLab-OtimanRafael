package ro.uvt.info.splabotimanrafael2026.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabotimanrafael2026.Book;
import ro.uvt.info.splabotimanrafael2026.commands.CommandExecutor;
import ro.uvt.info.splabotimanrafael2026.commands.GetBooksCommand;
import ro.uvt.info.splabotimanrafael2026.observer.AllBooksSubject;
import ro.uvt.info.splabotimanrafael2026.services.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final CommandExecutor commandExecutor;
    private final AllBooksSubject allBooksSubject;

    @Autowired
    public BooksController(BooksService booksService, CommandExecutor commandExecutor, AllBooksSubject allBooksSubject) {
        this.booksService = booksService;
        this.commandExecutor = commandExecutor;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public List<Book> getBooks() {
        GetBooksCommand command = new GetBooksCommand(booksService);
        return command.execute();
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable String id) {
        return "Returneaza detaliile cartii cu id " + id;
    }

    @PostMapping
    public String newBook(@RequestBody(required = false) Book newBookRequest) {
        Book book = (newBookRequest != null) ? newBookRequest : new Book("Manual de Securitate Cibernetica");
        Book savedBook = booksService.addBook(book);
        allBooksSubject.add(savedBook);
        return "Book saved [" + savedBook.getId() + "] " + savedBook.getTitle();
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable String id) {
        return "Actualizeaza cartea cu id " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id) {
        return "Sterge cartea cu id " + id;
    }
}