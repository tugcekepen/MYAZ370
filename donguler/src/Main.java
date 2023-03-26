import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for(başlangıç; koşul; artış/azalış){
            kod bloğu
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        if (sayi<0){
            System.out.println("negatif");
        }else if (sayi>0){
            System.out.println("pozitif");
        }else{
            System.out.println("sıfıra eşit");
        }
        */
        /*
        String sifre = "2323";
        Scanner input = new Scanner(System.in);
        System.out.print("Bir şifre giriniz: ");
        String user = input.nextLine();
        if (user.equals(sifre)){
            System.out.println("başarılı");
        }
        else{
            System.out.println("başarısız");
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Ay sayısını giriniz: ");
        int ay = input.nextInt();
        switch(ay){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            default:
                System.out.println("Geçersiz bir sayı girdiniz!");
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("3 sayı giriniz. ");
        int sayi1, sayi2, sayi3;
        System.out.print("1. sayı: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayı: ");
        sayi2 = input.nextInt();
        System.out.print("3. sayı: ");
        sayi3 = input.nextInt();
        
        if (sayi1>=sayi2 && sayi1>=sayi3){
            System.out.println("En büyük sayı: "+ sayi1);
        }else if(sayi2>=sayi1 && sayi2>=sayi3){
            System.out.println("En büyük sayı: "+ sayi2);
        }else if(sayi3>=sayi1 && sayi3>=sayi2){
            System.out.println("En büyük sayı: "+ sayi3);
        }
        else{
            System.out.println("Bir hata oluştu!");
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("3 sayı giriniz. ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        
        if (sayi1>=sayi2 && sayi1>=sayi3){
            System.out.println("En büyük sayı: "+ sayi1);
        }else if(sayi2>=sayi1 && sayi2>=sayi3){
            System.out.println("En büyük sayı: "+ sayi2);
        }else if(sayi3>=sayi1 && sayi3>=sayi2){
            System.out.println("En büyük sayı: "+ sayi3);
        }
        else{
            System.out.println("Bir hata oluştu!");
        }
        */
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = scan.nextInt();
        System.out.println(faktoriyel(sayi));
        System.out.println(kare(sayi)); 
        System.out.println(kup(sayi));
        */
        /*
        topla(1, 5);
        topla(1,2,6);
        topla("Yazılım", "Müh");
        */
        /*
        for (int i=2; i<100; i++){
            if (asalmi(i)){
                System.out.println(i);
            }
        }
        */
    }
    
    
    // metotlar main fonk dışında yazılır //main içinde fonk çağrılır
    /*
    public static void faktoriyel(int sayi){
        int fakt = 1;
        while(sayi>0){
            fakt *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyeli = "+fakt);
    }
    */
    /*
    public static int kare(int sayi){
        return sayi * sayi;
    }
    
    public static int kup(int sayi){
        return sayi * sayi * sayi;
    }
    */
    
    //OVERLOADING - Aşırı Yükleme
    /*
    public static void topla(int a, int b){
        System.out.println("Toplamı = "+ (a+b));
    }
    
    public static void topla(int a, int b, int c){
        System.out.println("Toplamı = "+ (a+b+c));
    }
    
    public static void topla(String a, String b){
        System.out.println(a+" "+b);
    }
    */
    /*
    public static boolean asalmi(int a){    // !!!!!!!!!!!!!!!!!!!!!
        for ( int i = 2; i<a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    */
}
