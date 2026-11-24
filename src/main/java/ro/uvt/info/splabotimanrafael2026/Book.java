package ro.uvt.info.splabotimanrafael2026;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor(force = true)
public class Book extends Section {
    
    @ManyToMany
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        super.accept(visitor);
    }
}