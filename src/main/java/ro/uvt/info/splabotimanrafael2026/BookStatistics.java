package ro.uvt.info.splabotimanrafael2026;

public class BookStatistics implements Visitor {
    private int imageCount = 0;
    private int tableCount = 0;
    private int paragraphCount = 0;

    @Override
    public void visitBook(Book book) {
    }

    @Override
    public void visitSection(Section section) {
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphCount++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageCount++;
    }

    @Override
    public void visitImage(Image image) {
        imageCount++;
    }

    @Override
    public void visitTable(Table table) {
        tableCount++;
    }

    public void printStatistics() {
        System.out.println("Statistici Carte:");
        System.out.println("*** Numar imagini: " + imageCount);
        System.out.println("*** Numar tabele: " + tableCount);
        System.out.println("*** Numar paragrafe: " + paragraphCount);
    }
}