package ro.uvt.info.splabotimanrafael2026;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element e) {
        super.add(e);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}