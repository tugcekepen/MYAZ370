

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author TugceK
 */
public class linkexample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Samsun");
        linkedList.add("Elazığ");
        linkedList.add("Ordu");
        linkedList.add("İstanbul");
        linkedList.add("Ankara");
        linkedList.remove(2);
        linkedList.add("Rize");
        
        yazdir(linkedList);
        
    }
    
    public static void yazdir(LinkedList<String> list){
        /*
        for (String sehir : list) {
            System.out.println(sehir);
        }
        */
        
        //LinkedList içerisinde gezinmenin ileri seviyesi
        ListIterator iterator = list.listIterator(); //list içerisindeki gezinme aracımız iteratör
        while(iterator.hasNext()) { //"ileride eleman var mı?" --> iteratör bir sonraki hamleye sahipse hasNext() true dönecek.
            System.out.println(iterator.next()); //next() ise "ileri doğru", --> o bahsettiğimiz bir sonraki hamleyle listedeki hamle sonucunda üstünden geçtiği elemanı tutacak
        } 
        //iterator şu an tüm elemanları gezdi ve şu an ki konumu en son elamanın(Rize) ardında bir NULL değerdedir.!!!
        //yani eğer şu andan itibaren
        //  System.out.println(iterator.next());
        //kodu çalıştırmak istesek HATA alırız. Çünkü zaten en son NULL'daydık yani artık eleman yok ileriye gidemez!
        
        System.out.println(iterator.previous()); //previous() "geriye doğru" --> bulunduğu konumdan geriye hareket edecek. //Rize
        /*haliyle hasPrevious() ise "geride eleman var mı?" --> varsa true döner.*/
    }
}
