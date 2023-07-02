
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Map - interface
//TreeMap - class
public class Map_example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cümle gir : ");
        String cumle = scan.nextLine();
        Map<Character, Integer> treemap1 = new TreeMap<Character, Integer>();
        Map<Character, Integer> treemap2 = new TreeMap<Character, Integer>();

        /*
        for (int i=0; i<cumle.length(); i++){
            char x=cumle.charAt(i);
            if (treemap1.containsKey(x))
            {
                treemap1.replace(x, i); // aynı harften varsa son indis değeriyle o harfi tutacak
            }
            else
            {
                treemap1.put(x, i);
            }
        }
        
        for (Map.Entry<Character, Integer>entry:treemap1.entrySet()) {
            System.out.println ("Anahtar: " + entry.getKey() + "Deger: " + entry.getValue());
        }
        */
        
        System.out.println("Girdiğiniz cümledeki harflerin adetleri"); // ÖDEV
        for (int i=0; i<cumle.length(); i++){
            char x=cumle.charAt(i);
            if (treemap2.containsKey(x))
            {
                treemap2.replace(x, treemap2.get(x)+1); // aynı harften varsa son indis değeriyle o harfi tutacak
            }
            else
            {
                treemap2.put(x, 1);
            }
        }
        
        
        for (Map.Entry<Character, Integer>entry:treemap2.entrySet()) {
            System.out.println ("Harf: " + entry.getKey() + " -> Adet: " + entry.getValue());
        }
        
        
        //sinav
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Elma", 1);
        map.put("Armut", 2);
        map.put("Kiraz", 3);
        map.put("Muz", 4);
        System.out.println(map.keySet());

    }
}
