public class Main {
    public static void main(String[] args) {
      
        Fakulte fk1 = new Fakulte("Yazılım Mühendisliği");
        Fakulte fk2 = new Fakulte("Makine Mühendisliği");
        
        fk1.Bolum_Ismi();
        fk2.Bolum_Ismi();
        
        //static
        //program çalıştığında bir kere çalışır, bellekte bir kere yer tutulur. ve artık bellek üzerinden direkt erişimi mümkün kılar
        System.out.println("Bölüm sayısı (class ismi üzerinden) : " + Fakulte.bolum_sayisi); //bolum_sayisi "private" tanımlanmışsa erişebilmek için getBolum_sayisi() metodu kullanılır
        System.out.println("Bölüm sayısı (nesne ismi fk1 üzerinden) : " + fk1.bolum_sayisi);
        System.out.println("Bölüm sayısı (nesne ismi fk2 üzerinden) : " + fk2.bolum_sayisi);
        
        bolum(); //static bir metodun içerisinde sadece static olan metotlar çağrılabilir. (main metodu dikkat edilirse static bir metottur!)
        
        System.out.println("-----------------");
        
        //inner-class STATIC OLMAYAN
        Geometri.Ucgen ucgen = new Geometri().new Ucgen();
        Geometri.Dortgen.Dikdortgen dikdortgen = new Geometri().new Dortgen().new Dikdortgen();
        Geometri.Dortgen.Kare kare = new Geometri().new Dortgen().new Kare();
        Geometri.Daire daire = new Geometri().new Daire();
        
        ucgen.alan(5, 12);
        dikdortgen.alan(8, 10);
        kare.alan(6);
        daire.alan(8);
        
        //inner-class STATIC OLAN
        Geometri.Alan staticClass = new Geometri.Alan(); //new'leme farklı!!!
        staticClass.kare_alan(5); //erişim 1
        //veya
        Geometri.Alan.kare_alan(6); //erişim 2
        
        System.out.println("-----------------");
        
        //inner-class LOCAL
        //anlık olr metoda classa ihtiyaç duyulduğunda local classlar oluşturulabilir
        //local sınıflar sadece ve sadece içinde bulunduğu metoda özgüdür
        //metot dışında erişilemez.
        class Geomet {
            public void kare_alan(int kenar){
                System.out.println("Kare alan = " + kenar*kenar);
            }
        }
        
        Geomet geo = new Geomet();
        geo.kare_alan(7);
        
        System.out.println("-----------------");
        
        //inner-class ANONIM
        //herhangi bir class tanımlama olmadan obje oluşturabiliyoruz (interface-abstract classlarımız varsa yararlanılır)
        
        //--interface
        Arayuz arayuz = new Arayuz(){
            @Override
            public void ekranaYaz() {
                System.out.println("interface anonim class");
            }
        }; //noktalı virgüle dikkat!
        arayuz.ekranaYaz();
        
        //--abstract --newleme yapabilmek için abstract classın STATIC tanımlanmış olması gerekli
        Abstractt abstractt = new Abstractt("Yazılım Mühendisliği"){
            @Override
            public void ekranaYaz() {
                System.out.println("abstract class anonim class -- Bölüm : " + getBolum());
            }
        }; //noktalı virgüle dikkat!
        abstractt.ekranaYaz();
        
        System.out.println("-----------------");
        
        //final keyword
        //bu kelime ile bir özelliğin değeri sadece bir kere verilebiliyor.
        //bu özellik tanımlanan yerde ya da ctor içerisinde verilebilir
        //değeri herhangi bir fonk ile verilemez veya değiştirilemez!!
        //alt sınıflarda override edilemez!!
        //kalıtımla devralınamaz!!
        System.out.println("Admin ismi : " + AdminControl.adminName);
    }
    
    public static void bolum(){
        System.out.println("Yazılım Mühendisliği");
    }
    
    public interface Arayuz{
        void ekranaYaz();
    }
    
    public static abstract class Abstractt{ //STATIC dikkat
        private String bolum;

        public Abstractt(String bolum) {
            this.bolum = bolum;
        }

        public String getBolum() {
            return bolum;
        }

        public void setBolum(String bolum) {
            this.bolum = bolum;
        }
        
        abstract void ekranaYaz();
    }
    
}
