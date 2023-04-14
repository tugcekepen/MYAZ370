/**
 *
 * @author TugceK
 */
public class Main {
    /*
    inheritence : bir üst sınıftan alt sınıflar üretmemizi sağlar. 
                  bu üst sınıfın özelliklerine ve metotlarına erişebiliyoruz ve alt sınıfta kullanabiliyoruz, metotları override ediyoruz
    keyword : EXTENDS
    */
    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici("Tuğçe", 30000, "Yapay Zeka", "Akdeniz");
        yonetici.Goster();
    }
}
