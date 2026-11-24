package ro.uvt.info.splabotimanrafael2026;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@jakarta.persistence.Table(name = "BookTable")
@NoArgsConstructor(force = true)
public class Table extends Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Table with Title: " + title);
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}