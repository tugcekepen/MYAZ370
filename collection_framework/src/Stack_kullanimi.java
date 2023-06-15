
import java.util.Enumeration;
import java.util.Stack;

//Stack - class
public class Stack_kullanimi {
    public static void main(String[] args) {
        //FİLO
        //LİFO
        Stack<String> stack = new Stack<String>();

        //eleman ekleme - push();
        //eleman çıkarma - pop(); -> çıkartılan elemanı geri döndürür
        //eleman çıkarılacak olsa o hangi eleman olurdu? yani son eklenen eleman, en üstteki eleman ne? peek();

        stack.push("Samsun");
        stack.push("Elazığ");
        stack.push("Rize");
        stack.push("Ankara");
        
        //stack'i gezersek gördüğümüz şey LİFO mantığında olmaz, aynı eklediğimiz sırada görürüz.
        for (String string : stack) {
            System.out.println(string);
        }
        
        System.out.println("---------");
        
        //enumeratoe ile gezme
        Enumeration<String> enumerator = stack.elements();
        while (enumerator.hasMoreElements()) {
            System.out.println(enumerator.nextElement());
        }
        
        System.out.println("---------");
        
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        
        System.out.println("---------");
        
        for (String string : stack) {
            System.out.println(string);
        }
    }
}
