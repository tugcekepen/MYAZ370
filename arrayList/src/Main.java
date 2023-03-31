
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
        
    }
    
    public static void yazdir(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
