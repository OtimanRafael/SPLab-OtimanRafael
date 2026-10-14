package ro.uvt.info.splabotimanrafael2026;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Element> content;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.content = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element e) {
        this.content.add(e);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (Element element : content) {
            element.print();
        }
    }
}