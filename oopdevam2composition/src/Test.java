/**
 *
 * @author TugceK
 */
public class Test {
    public static void main(String[] args) {
        //is-a : üst sınıfa bağlanan alt sınıflar ile üst sınıflar arasındaki ilişki türüdür
        //has-a : sahiplik ilişkisi vardır

        Cozunurluk cozunurluk = new Cozunurluk(1920, 1080);
        Monitor monitor = new Monitor("LG", "UltraGear", cozunurluk);
        Kasa kasa = new Kasa("Rampage", "Led");
        Anakart anakart = new Anakart("A350M-H", "Gigabayt");

        Pc pc1 = new Pc(monitor, kasa, anakart);
        pc1.getKasa().Kasa_Ac();
        pc1.getMonitor().Monitor_Ac();
        pc1.getAnakart().IslteimSistemi("Windows");
        pc1.getMonitor().Monitor_Kapat();
        pc1.getKasa().Kasa_Kapat();
    }
}
