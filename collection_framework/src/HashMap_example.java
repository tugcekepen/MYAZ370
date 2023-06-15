
import java.util.HashMap;

//HashMap - class
public class HashMap_example {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        
        // HashMap - eleman ekleme - put(key, value);
        hashmap.put(23, "Elazığ");
        hashmap.put(34, "İstanbul");
        hashmap.put(55, "Samsun");
        hashmap.put(06, "Ankara");
        
        System.out.println(hashmap);
        
        /*
        hashmap.put(23, "Harput"); // hashmap içerisinde var olan key'in value'su değiştirilir
        
        System.out.println("---key'in value'su değiştirilir--");
        System.out.println(hashmap);
        */
        
        System.out.println(hashmap.get(23)); //HashMap içerisinden value çekme - get fonksiyonuna key değeri verilerek
        System.out.println(hashmap.get(25)); //eğer verilen key değeri map içinde yoksa "null" döndürür!!!!!!!!!!!!!!!!!!!!!
    }
}
