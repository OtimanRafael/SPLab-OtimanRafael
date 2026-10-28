package ro.uvt.info.splabotimanrafael2026;

public abstract class Element {
    private Element parent;

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    public abstract void print();
    public abstract void add(Element e);
    public abstract void remove(Element e);
    public abstract Element get(int index);
    public abstract void accept(Visitor visitor);
}