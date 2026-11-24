package ro.uvt.info.splabotimanrafael2026.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabotimanrafael2026.Book;
import ro.uvt.info.splabotimanrafael2026.commands.AddBookCommand;
import ro.uvt.info.splabotimanrafael2026.commands.CommandExecutor;
import ro.uvt.info.splabotimanrafael2026.commands.GetBooksCommand;
import ro.uvt.info.splabotimanrafael2026.services.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final CommandExecutor commandExecutor;

    @Autowired
    public BooksController(BooksService booksService, CommandExecutor commandExecutor) {
        this.booksService = booksService;
        this.commandExecutor = commandExecutor;
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
    public ResponseEntity<String> createBook() {
        Book newBook = new Book("Manual de Securitate Cibernetica");
        AddBookCommand command = new AddBookCommand(booksService, newBook);
        commandExecutor.executeAsync(command);
        return new ResponseEntity<>("Cerere de creare carte trimisa catre baza de date.", HttpStatus.ACCEPTED);
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