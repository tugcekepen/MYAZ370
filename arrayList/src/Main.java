
import java.util.ArrayList;

/**
 *
 * @author TugceK
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(); // <T> için ilkel veri tiplerinin yazımı; T --> String, Integer, Double, Boolean, Char
        array.add("Samsun");
        array.add("Elazığ");
        array.add("Ordu");
        array.add("İstanbul");
        array.add("Ankara");
        
        System.out.println(array.get(4)); //Ankara
        
        System.out.println("------");
        
        array.remove("Ordu"); //Ordu'yu diziden kaldırır
        array.remove(2); //Ordu, dizinin 2. indisinde bulunurken Ordu'yu kaldırdıktan sonra 2. indise İstanbul yerleşti ve burada İstanbul'u diziden kaldırdı.
        array.set(1, "HARPUT"); //1. indisteki eleman("Elazığ"), "HARPUT" olr güncellenir.
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i)); //Samsun, HARPUT, Ankara
        }

        System.out.println("------");
        
        yazdir(array); //Samsun, HARPUT, Ankara ---> Burada elemanları, kendi yazdığımız fonk yardımıyla yazdırdık.
        
        System.out.println("------");
        
        String sehir = new String("Samsun");
        System.out.println(sehir);
        System.out.println("Karakter sayısı = "+ sehir.length()); //dizilerde uzunluğu size() ile alırken String'te length() ile alıyoruz.
        System.out.println("İlk karakter = "+ sehir.charAt(0)); //Dikkat ! sehir[0] değil, sehir.charAt(0) !
        System.out.println(sehir.indexOf("s")); //parametre olarak verdiğimizin hangi indexte olduğunu verir. Birkaç tane varsa ilk bulduğunu söyler.
        System.out.println(sehir.lastIndexOf("s")); //sondan bakarak ilk karşılaştığı indexi verir.
        System.out.println(sehir.startsWith("Sa")); //parametre olarak verilen ifadeyle başlarsa "true" döner, değilse "false"
        System.out.println(sehir.endsWith("sun")); //parametre olarak verilen ifadeyle biterse "true" döner, değilse "false"
        
        System.out.println("------");
        
        String x="2023";
        int y = Integer.parseInt(x); //String'i int'e çevirme !!!
        System.out.println(y-20);
        
        int a=1990;
        String b = String.valueOf(a); //int'i String'e çevirme !!!
        System.out.println(b);
        
        System.out.println("------");
        
        String str1 = "Yazılım";
        String str2 = "Yazılım";
        if(str1==str2){ //Aynı
            System.out.println("Aynı");
        }else{
            System.out.println("Aynı değil");
        }
        
        String str3 = new String("Mühendislik");
        String str4 = new String("Mühendislik");
        if(str3==str4){ //Aynı değil
            System.out.println("Aynı");
        }else{
            System.out.println("Aynı değil");
        }
        /*
        aradaki fark; üstteki değer tipli tanımlandı, alttaki referans tipli tanımlandı !!!
        alttaki 3 ile 4ün adresleri farklı.
        eğer if bloğunun şartını str3.equals(str4) şeklinde yazsaydık, bu sefer referansların içindeki değerlere bakardı. "Aynı" sonucu verirdi.
        */
        
    }
    
    public static void yazdir(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
