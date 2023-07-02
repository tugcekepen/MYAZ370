
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import javax.management.Query;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(23);
        queue.offer(55);
        queue.offer(10);
        queue.offer(34);
        queue.offer(61);
        System.out.println(queue.poll());

    }
}
