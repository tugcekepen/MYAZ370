
import java.util.Scanner;


public class Throw_example {
    //throw ile kendi hata çeşitlerimizi oluşturabiliriz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
        
        try {
            kontrol(yas);
        } catch (Exception e) {
            System.out.println("18 yaş altı giremez");
        }
    }

    public static void kontrol(int yas) {
        if(yas<18){
            throw new ArithmeticException();
        }else {
            System.out.println("Hoşgeldiniz");
        }
    }
}
