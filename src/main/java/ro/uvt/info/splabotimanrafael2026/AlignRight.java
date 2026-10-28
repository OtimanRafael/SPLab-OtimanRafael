package ro.uvt.info.splabotimanrafael2026;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String paragraphText) {
        System.out.println(paragraphText + " >>");
    }
}