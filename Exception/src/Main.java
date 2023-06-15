
public class Main {
    //Exception -> programların çalışma zamanında normal akışını bozan olaylardır
    //bunların yakalanması, programlarımızın daha güvenli çalıştırılması için geliştirilmiş bir mekanizmadır
    //Hata oluşturan herhangi bir kod varlığında, program hatayı gördükten sonraki alt satır kodlara ulaşamaz. Hatayı bulduğu yerde programı durdurur ve hatayla sonlandırır
    
    // -- checked exception
    // - unchecked exception
    
    public static void main(String[] args) {
        //String s = null;
        //System.out.println(s.length()); // NullPointerException
        
        //int a = 5/0; // ArithmeticException -> RuntimeException -> Exception
        
        //int[] b = {0, 1, 2, 3};
        //System.out.println(b[5]); // ArrayIndexOutOfBoundsException -> IndexOutOfBoundsException -> RuntimeException -> Exception
        
        //TRY-CATCH BLOĞU ile program otomatik durdurulmadan hataları yakalayabiliriz. Hatanın oluştuğu yerden sonraki kodlar çalışmaya devam edecektir
        /*
        try {
            //Exception oluşabilecek kodlarımızın yazıldığı yer
        }
        catch(Exception türü){
            //Exception olduğunda çalışacak kodların yazıldığı yer
        }
        finally{
            //Exception oluşsa da oluşmasa da çalışacak kodlar. Örn: dosya kapama, veritabanı bağlantısını kesme vb.
        }
        */
        
        //Ekran çıktısı ne olur? try-catch dışındaki kodlar çalışır mı? 
        try {
            int a = 5/0;
        }
        catch (ArithmeticException e){ //veya Exception e //veya RuntimeException e falan
            System.out.println("Bir sayı sıfıra bölünemez!");
        }
        System.out.println("çalıştı");
        
        System.out.println("---------------------------------------------");
        
        //Ekran çıktısı ne olur? Her iki catch de çalışır mı? Her ikisi de ekranda yazarsa nasıl bir sıra ile yazar?
        //- Program akışına dikkat et
        try {
            int[] b = {0, 1, 2, 3};
            System.out.println(b[5]);
            int a = 5/0;
        }
        catch (ArithmeticException e){ //veya Exception e //veya RuntimeException e falan
            System.out.println("Bir sayı sıfıra bölünemez!");
        }
        catch (ArrayIndexOutOfBoundsException e){ //veya Exception e //veya RuntimeException e falan
            System.out.println("Dizinin sınırı aşıldı!");
        }
        
        //BİRKAÇ TANE CATCH BLOĞU YAZIYORSAN *özelden genele* gitmeye dikkat et !!!!!!
        //Genelden özele gidemezsin zaten program derleme hatası verir çalıştırmana izin vermez veya program çalışmaz
       
        System.out.println("---------------------------------------------");
        
        //Doğru hata türü yazılmadığı için hatayı yakalayamayız ancak finally bloğu her türlü çalışır.
        //ekrana ilk önce "Finally çalıştı" yazar artından hata mesajını göstererek programı durdurur. try-catch devamındaki "çalıştı" satırına ulaşamaz
        try {
            int a = 5/0;
        }
        catch(NullPointerException e){
            System.out.println("Bir sayı sıfıra bölünemez!");
        }
        finally{
            System.out.println("Finally çalıştı");
        }
        System.out.println("çalıştı");
    }
}
