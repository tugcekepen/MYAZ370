
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set -> Verileri sadece 1 DEFA depolar

//Set - interface
//HashSet - class
//LinkedHashSet - class
//SortedSet - interface
//TreeSet - class
public class Set_kullanimi {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>(); //Elemanların sırası önemli değilse ve sorgulama işlemlerinin hızlı yapılması isteniyorsa tercih edilebilir
        Set<String> set2 = new LinkedHashSet<String>(); //Elemanların EKLEME SIRASI önemli ise önerilir
        Set<String> set3 = new TreeSet<String>(); //Elemanların sıralanması önemliyse yani sıralı bir set lazımsa ise TreeSet önerilir
        //TreeSet diğer ikisine göre daha yavaştır
        
        //HashSet -- Verileri karmaşık tutar
        set1.add("SAMU");
        set1.add("Mühendislik");
        set1.add("Fakültesi");
        set1.add("Yazılım");
        set1.add("Mühendisliği");
        
        //LinkedHashSet -- Verileri eklediğin sıraya göre tutar
        set2.add("SAMU");
        set2.add("Mühendislik");
        set2.add("Fakültesi");
        set2.add("Yazılım");
        set2.add("Mühendisliği");
        
        //TreeSet -- Verileri sıralı tutar (burada alfabetik)
        set3.add("SAMU");
        set3.add("Mühendislik");
        set3.add("Fakültesi");
        set3.add("Yazılım");
        set3.add("Mühendisliği");
        
        System.out.println("--------HashSet--------");
        for (String hash : set1) {
            System.out.println(hash);
        }
        
        System.out.println("--------LinkedHashSet--------");
        for (String linked : set2) {
            System.out.println(linked);
        }
        
        System.out.println("--------TreeSet--------");
        for (String tree : set1) {
            System.out.println(tree);
        }
        System.out.println("---");
        System.out.println(set3.contains("Yazılım"));
        System.out.println(set3.contains("Yazılım12"));
        System.out.println(set3.isEmpty());

    }
}
