
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class input_main {
    public static void main(String[] args) {
        //FileInputStream
        
        FileInputStream ff = null;
        
        try {
            ff = new FileInputStream("bolum.txt");
            try {
                //okuma kısmı
                /*
                System.out.println("İlk karakter " + (char)ff.read()); // char'a dönüştürmeyi unutma
                System.out.println("İkinci karakter " + (char)ff.read());
                
                ff.skip(2); //2 karakter atlar(2 adım veri atlar)
                
                System.out.println("2 karakter sonraki ilk karakter " + (char)ff.read());
                */
                
                //tüm dosya karakterlerini okumak istiyorsak WHILE döngüsü
                int karakter = ff.read();
                String xx = "";
                while (karakter != -1) {                    
                    xx += (char)karakter;
                    karakter = ff.read();
                }
                System.out.println(xx);
                
            } catch (IOException ex) {
                System.out.println("Okunamadı.");
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        }
        finally {
            try {
                //ff.close(); // bu şekilde, bolum.txt dosyasını bulamadığı bir senaryoda hata alırız. var olmayan bir dosya durumunda hata çıkarır.
                // o yüzden if bloğu içine almalıyız
                if(ff!=null){ // ff!=null ile dosyanın var olup olmadığının kontrolü sağlanıyor
                    ff.close(); 
                }
            }
            catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu.");
            }
        }
    }
        
}
