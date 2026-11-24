package ro.uvt.info.splabotimanrafael2026;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Element {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setParent(Element parent) {
    }

    public Element getParent() {
        return null;
    }

    public abstract void print();
    public abstract void add(Element e);
    public abstract void remove(Element e);
    public abstract Element get(int index);
    public abstract void accept(Visitor visitor);
}