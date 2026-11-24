package ro.uvt.info.splabotimanrafael2026.commands;

import ro.uvt.info.splabotimanrafael2026.Book;
import ro.uvt.info.splabotimanrafael2026.services.BooksService;

public class AddBookCommand implements Runnable {
    private final BooksService booksService;
    private final Book book;

    public AddBookCommand(BooksService booksService, Book book) {
        this.booksService = booksService;
        this.book = book;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            booksService.addBook(book);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}