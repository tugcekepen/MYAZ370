
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map - interface
//HashMap - class
//LinkedHashMap - class
//SortedMap - interface
//TreeMap - class
public class Map_kullanimi {
    public static void main(String[] args) {
        //bir key birden fazla kez bulunamazken bir değer birden fazla olabilir
        Map<Integer, String> hashmap = new HashMap<Integer, String>(); //Elemanların sırası önemli değilse ve sorgulama işlemlerinin hızlı yapılması isteniyorsa tercih edilebilir
        Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>(); //Elemanların EKLEME SIRASI önemli ise önerilir
        Map<Integer, String> treemap = new TreeMap<Integer, String>(); //Elemanların sıralanması önemliyse yani sıralı bir set lazımsa ise TreeMap önerilir (key'lere göre sıralama)
        
        System.out.println("\n*********HashMap*********"); //HashMap -- Verileri karmaşık tutar
        goster(hashmap);
        System.out.println("\n*********LinkedHashMap*********"); //LinkedHashMap -- Verileri eklediğin sıraya göre tutar
        goster(linkedhashmap);
        System.out.println("\n*********TreeMap*********"); //TreeMap -- Verileri sıralı tutar (key'deki verileri sıralar)
        goster(treemap);
    }
    
    public static void goster(Map<Integer, String> map) {
        map.put(107, "Algoritma Tasarımı");
        map.put(404, "Algoritma Tasarımı");
        map.put(338, "Algoritma Tasarımı");
        map.put(107, "Algoritma Tasarımı");
        map.put(107, "Algoritma Tasarımı");
        
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Anahtar: " + entry.getKey() + " - Değer: " + entry.getValue());
        }
    }
}
