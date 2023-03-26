
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //int[] a;
        //double[] b;
        
        //int[] aa = new int[15];
        //aa[5] = 3;
        
        //String[] bb = new String[25];
        
        /*
        int[] x = {1,2,3,4,5,6};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        */
        /*
        int[] y = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < y.length; i++) {
            y[i] = scan.nextInt(); //dizinin içine elemanları kullanıcı atıyor
        }
        */
        
        //TEK BOYUTLU DİZİ
        // -->  int[] tekBoyutlu = {1,2,3,4,5,};
        //İKİ BOYUTLU DİZİ
        // -->  int[][] ikiBoyutlu = new int[2][2];
        // -->  int[][] ikiBoyutlu2 = { {1,2,3} , {1,2,3} };
        
        /*
        int[][] ikiBoyutlu = new int[2][2];
        Scanner scan = new Scanner(System.in);
        //ikiBoyutlu[0][0] = scan.nextInt();
        //ikiBoyutlu[0][1] = scan.nextInt();
        //ikiBoyutlu[1][0] = scan.nextInt();
        //ikiBoyutlu[1][1] = scan.nextInt();
        //veya
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ikiBoyutlu[i][j] = scan.nextInt(); //elamanları alıyoruz
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ikiBoyutlu[i][j]+ " "); //elemanları ekrana basıyoruz
            }
            System.out.println();
        }
        */
        
        // tek boyutlu dizilerde bir başka elemanları ekrana basma yöntemi
        //FOREACH
        int[] tekBoyutlu = {1,2,3,4,5,};
        for(int i:tekBoyutlu){
            System.out.println(i);
        }
        
        String[] array = { "SAMU", "YAZILIM", "MUH"};
        for(String i:array){
            System.out.println(i);
        }
        
    }
}
