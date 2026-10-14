package ro.uvt.info.splabotimanrafael2026;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        this.subChapters.add(subChapter);
        return this.subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return this.subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}