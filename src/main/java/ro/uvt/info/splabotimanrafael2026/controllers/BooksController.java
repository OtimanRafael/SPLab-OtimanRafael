package ro.uvt.info.splabotimanrafael2026.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabotimanrafael2026.commands.GetBooksCommand;
import ro.uvt.info.splabotimanrafael2026.services.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<String> getBooks() {
        GetBooksCommand command = new GetBooksCommand(booksService);
        return command.execute();
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable String id) {
        return "Returneaza detaliile cartii cu id " + id;
    }

    @PostMapping
    public String createBook() {
        return "Creeaza o carte noua";
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