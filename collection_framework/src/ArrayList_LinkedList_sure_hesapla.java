
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList - class
//ArrayList - class
public class ArrayList_LinkedList_sure_hesapla {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); //LinkedList'lerde eleman eklemek daha rahat. 
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); //Array'de 1 tane başa eleman eklediğimizde diğer önceden var olan elemanları birer birer sola doğru kaydırmamız gerekiyor
        sure_hesapla("array", arrayList);
        sure_hesapla("linked", linkedList);
    }
    public static void sure_hesapla(String veri, List<Integer> list){
        long basla;
        long son;
        
        basla = System.currentTimeMillis();
        
        for(int i=0; i<100000; i++){
            list.add(0, i);
        }
        
        son = System.currentTimeMillis();
        System.out.println(veri + " " + (son-basla) + " ms");
    }
}
