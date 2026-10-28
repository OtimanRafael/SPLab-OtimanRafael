package ro.uvt.info.splabotimanrafael2026;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Splabotimanrafael2026Application {

    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1: Anomalia");
        
        Paragraph p1 = new Paragraph("Semnalul a fost detectat pe radar.");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Nava a intrat in hiperspatiu.");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Sistemele de propulsie sunt la 100%.");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Contact extraterestru iminent.");
        cap1.add(p4);
        
        System.out.println("--- Afisare fara aliniere ---");
        cap1.print();
        
        // Aplicăm strategiile de aliniere
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        
        System.out.println("\n--- Afisare cu aliniere ---");
        cap1.print();
    }
}