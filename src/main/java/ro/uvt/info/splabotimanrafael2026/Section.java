package ro.uvt.info.splabotimanrafael2026;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Section extends Element {
    private String title;
    
    @OneToMany(targetEntity = Element.class)
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void add(Element e) {
        if (e.getParent() != null) {
            throw new IllegalArgumentException("Acest element apartine deja altei sectiuni!");
        }
        e.setParent(this);
        children.add(e);
    }

    @Override
    public void remove(Element e) {
        children.remove(e);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }
}