package ro.uvt.info.splabotimanrafael2026;

public class GenerateToC implements Visitor {
    private TableOfContents toc;

    public GenerateToC() {
        this.toc = new TableOfContents();
    }

    public TableOfContents getToC() {
        return toc;
    }

    @Override
    public void visitBook(Book book) {
        toc.addEntry(book.getTitle());
    }

    @Override
    public void visitSection(Section section) {
        toc.addEntry(section.getTitle());
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
    }

    @Override
    public void visitImage(Image image) {
    }

    @Override
    public void visitTable(Table table) {
    }
}