
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

//Queue - interface
//LinkedList - class
public class Queue_kullanimi {
    public static void main(String[] args) {
        //FİFO
        //LİLO
        Queue<String> queue = new LinkedList<String>();
        
        // eleman ekleme - add() veya offer()
        // eleman çıkarma - poll() -> çıkarılan elemanı geri döndürür
        // eleman çıkarılacak olsa o hangi eleman olurdu? yani son eklenen eleman, en üstteki eleman ne? peek();
        
        queue.add("Samsun"); // -> add kullanıldığında eleman eklemezsek hata fırlatır
        queue.offer("Elazığ"); // offer kullanıldığında eleman eklemezsek sadece false döner
        queue.offer("Rize");
        queue.offer("Ankara");
        
        //stack'i gezersek gördüğümüz şey FİFO mantığında olmaz, aynı eklediğimiz sırada görürüz.
        for (String string : queue) {
            System.out.println(string);
        }
        
        System.out.println("---------");
        
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        
        System.out.println("---------");
        
        for (String string : queue) {
            System.out.println(string);
        }
    }
}
