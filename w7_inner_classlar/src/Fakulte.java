public class Fakulte {
    private String bolum;
    public static int bolum_sayisi = 0;  //static ile dışarıdan obje oluşturmadan ve de sınıf üzerinden erişim
    //private olsaydı sadece sınıf üzerinden erişebileceğimiz için getter metoduna ihtiyaç var 

    public Fakulte(String bolum) {
        this.bolum = bolum;
        bolum_sayisi++;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    
    public void Bolum_Ismi(){
        System.out.println(bolum + " Bölümü");
    }
}
