package ro.uvt.info.splabotimanrafael2026;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> children;

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    @Override
    public void add(Element e) {
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
}