package ro.uvt.info.splabotimanrafael2026;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(String paragraphText) {
        System.out.println("== " + paragraphText + " ==");
    }
}