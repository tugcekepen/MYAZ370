/**
 *
 * @author TugceK
 */
public class Main {
    public static void main(String[] args) {
        Telefon tel1 = new Telefon(); //default ctor
        // tel1 nesnesiyle Telefon sınıfının public ve internal olan tüm prop veya metotlarına vs. erişebiliriz.
        // private: gizli
        // protected: sadece o sınıfta veya o sınıfı miras alan diğer sınıflarda
        // internal: sadece o proje içerisinde
        // public: her yerden erişilebilir
        tel1.setMarka("Apple");
        System.out.println("Telefonun markası: " + tel1.getMarka());
        tel1.setFiyat(-1000); //Fiyat 0'dan az olamaz.
        
        System.out.println("-----");
        
        //oluşturduğumuz parametreli ctor'lar ile nesne oluşturma;
        Telefon tel2 = new Telefon("Rose Gold", "Apple", "iOS", 9000, 5);
        Telefon tel3 = new Telefon("Beyaz", "Samsung", 6000);
        
        tel1.Goster();
        System.out.println("-----");
        tel2.Goster();
        System.out.println("-----");
        tel3.Goster();
    }
}
