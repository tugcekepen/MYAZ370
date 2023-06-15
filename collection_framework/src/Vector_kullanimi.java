
import java.util.ListIterator;
import java.util.Vector;

//Vector - class
public class Vector_kullanimi {
    public static void main(String[] args) {
        //Stack mantığı vardır LİFO
        Vector<String> vector = new Vector<String>();
        
        vector.add("SAMU");
        vector.add("Üni");
        vector.add("Yazılım");
        vector.add("Müh");
        
        /*
        for (String x : vector) {
            System.out.println(x);
        }
        */
        
        ListIterator<String> iterator = vector.listIterator(); //vector ile böyle gezinebiliyoruz
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("İlk veri: " + vector.firstElement());
        System.out.println("Son veri: " + vector.lastElement());
    }
}
