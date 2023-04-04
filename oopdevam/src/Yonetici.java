
import java.util.zip.Adler32;

/**
 *
 * @author TugceK
 */
public class Yonetici extends Calisan{
    public String bolge;
    public Yonetici(String ad, double maas, String bolum, String bolge) {
        super(ad, maas, bolum);
        this.bolge = bolge;
    }
    
    @Override
    public void Goster()
    {
        /*System.out.println("Ad: " + ad + "\nMaaş: " + maas + "\nBölüm: " + bolum
        + "\nBölge: " + bolge);*/
        super.Goster();
        System.out.println("Bölge: " + bolge);
    }
    
}
