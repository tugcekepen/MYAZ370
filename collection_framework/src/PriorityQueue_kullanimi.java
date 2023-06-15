
import java.util.Enumeration;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue - interface
//PriorityQueue - class
public class PriorityQueue_kullanimi {
    public static void main(String[] args) {
        //PriorityQueue verileri sıralı bir şekilde depolar
        Queue<Integer> p_queue = new PriorityQueue<Integer>();
        
        p_queue.offer(5);
        p_queue.offer(1);
        p_queue.offer(2);
        p_queue.offer(10);
        
        //foreach ile elemanları gezersek depoladığı şekilde yazdırmayacaktır
        for (Integer s : p_queue) {
            System.out.println(s);
        }
        
        System.out.println("---------");
        
        //depoladığı haliyle yani sıralı haldeki verileri görmek istiyorsak WHILE kullanmalıyız
        while (!p_queue.isEmpty()) {
            //poll kullandık çünkü döngü şartını eleman boş olmadıkça diye verdik. poll elemanları çıkardıkça en sonunda boş kalacak ve döngü sonlanacak
            System.out.println(p_queue.poll());
            //peek kullansaydık sonsuz döngüye girerdi çünkü hiçbir zaman p_queue boşalmayacaktı
        }
        
        System.out.println("---------");
        
        System.out.println(p_queue.peek());
        System.out.println(p_queue.contains(2));
        
        //son iki satırdan önce kuyruğu boşalttığını unutma :)
    }
}
