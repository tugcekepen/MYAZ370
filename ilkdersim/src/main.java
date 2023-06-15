
import java.util.Scanner; // kullanıdan giriş almak için kullanacağımız kütüphane

public class main {
    public static void main(String[] args) {
        System.out.println("Merhaba JAVA"); // sout yazarak CTRL+Space
        /* YAZILIM
        MÜHENDİSLİĞİ
        */
        /*
        int sayi1, sayi5;
        double gerceksayi;
        int x=1;
        System.out.println(x);
        */
        /*
        double a = 10.25;
        double c = 2d;
        System.out.println(a);
        System.out.println(c);
        */
        /*
        float a=(float)10.25;
        float c=5.2f;
        System.out.println(a);
        System.out.println(c);
        */
        /*
        String x = "Samsun\t";
        String y = "Üniversitesi\t";
        String z = "Yazılım";
        String topla = x + y + z;
        System.out.println(topla);
        
        String aa = "Yazılım\t" + "Müh\t" + "SAMU\t";
        System.out.println(aa);
        */
        /*
        int a = 5, b =4, c ;
        c = a++ +b;
        System.out.println(a); // 6
        System.out.println(b); // 4  
        System.out.println(c); // 9
        */
        
        int a = 5, b = 4, c;
        c = (a* ++b) / (6-a) * (a+b);
        System.out.println(c);
        boolean bool = (a+b)<(a+c)&&(a+b)>=(b+a);
        System.out.println(bool);
        
        
        Scanner scan = new Scanner(System.in); // Ctrl+Shift+I kombinasyonuyla otomatik olarak importu gerçekleştirir
        /*System.out.print("yaş girin: ");
        int yas = scan.nextInt();
        System.out.println("yaşınız: " + yas);*/
        
        /*int sayi = scan.nextInt();
        System.out.println("sayı: " + sayi);*/
        /*
        int sayi=scan.nextInt();
        String ad = scan.nextLine();
        System.out.println(sayi);
        System.out.println(ad);
            // çıktı; sadece yazılan sayı olur.
            // enter'a basılınca nextLine'dan ötürü girdiyi bitmiş gibi görüp enter anında enter'ı da string türü kabul ederek boşluk olarak alır ve ekrana sadece sayıyı yazdırır.
            // yani enter'a kadar ne var ne yok hepsini ekrana basar.*/
         /* // o yüzden ikinci değişkeni enterladıktan sonra girebilmek için;
        int sayi=scan.nextInt();
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.println(sayi);
        System.out.println(ad); // şeklinde bir yazım olmalı */
        /*
        //Kullanıcıdan kullandığı aracın km başına ne kadar yaktığını ve kaç km yol yapacağı
        //bilgilerini alan ve toplam ödeyeceği tutarı hesaplayan programı yazınız.
      
        double perKm, yol, total;
        System.out.print("Aracınız km başına ne kadar TL yakıyor? : ");
        perKm = scan.nextDouble();
        System.out.print("Kaç km yol gideceksiniz? : ");
        yol = scan.nextDouble();
        
        total = perKm * yol;
        
        System.out.println("Gidilecek yol: " + yol + " km\nYol için gereken toplam ücret: " + total + " TL");
        */
        
        //DÖNGÜLER
        /*
        for (baslangic ; kosul ; artisMiktari) {
            //kodlar
        }
        */
        /*
        for ( int x = 0; x < 10; x++ ) {
            System.out.println("SAMU");
        }
        */
        /*
        //Kullanıcıdan girilen sayı kadar ekrana merhaba yazdıran Java programını yazınız.
        System.out.print("Bir sayı gir: ");
        int sayi = scan.nextInt();
        for ( int i=0; i<sayi; i++) {
            System.out.println("merhaba");
        }
        */
        /*
        //faktöriyel
        System.out.print("Bir sayı gir: ");
        int sayi = scan.nextInt();
        int carpim = 1;
        for ( int i=1; i<sayi+1; i++) {
            carpim *= i;
        }
        System.out.println(carpim);
        */
        
        /*
        while (koşul) {
            //kodlar
        }
        */
        /*
        int i = 0 ;
        while ( i < 10 ) {
            System.out.println("SAMU");
            i++;
        }
        */
        /*
        int i = 11;
        do {
            System.out.println("SAMU");
            i++;
        } while (i < 10);
        */
        /*
        int i = 0;
        while (i<10){
            if ((i==7) || (i==9)){
                i++;
                continue;
            }
            System.out.println("i= "+i);
            i++;
        }
        */
        /*
        //Çarpım Tablosu
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println("-----------------");
        }
        */
    }
}
