public class Main {
    /*
    abstract : alt sınıflarda override edilmesi gereken ve gerekmeyen metotları abstract sınıfların içerisinde biriktiririz
    keyword : EXTENDS
    */
    //soyut ve somut metotlar bir arada bulunabilir
    //Kullanıcıya sadece önemli şeyler gösterilir.
    //Interface'ler gibi nesne oluşturamayız
    //bir sınıfın abstract olabilmesi için; en az 1 tane gövdesiz(soyut) metodu bulunmalıdır!
    public static void main(String[] args) {
        //Geometri sekil = new Geometri("Şekil"); //-->obje oluşturamayız!!
        
        Dikdortgen d1 = new Dikdortgen(3, 4, "Dikdörtgen");
        d1.AlanHesapla();
        
        Cember c1 = new Cember(6, "Çember");
        c1.AlanHesapla();
        
        // *
        
        Geometri geo;
        geo = new Cember(2, "Çember2"); //---> bu şekilde nesne üretilebilir.
        geo.AlanHesapla();
    }
}
