
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//JAVA INPUT-OUTPUT
//STREAM - verilerin input ve output yoluyla java projelerine aktarıldığı bir veri dizisidir. byte(0 or 1) olarak aktarılmakta
public class output_main {
    public static void main(String[] args) {
        //FileOutputStream
        //Bir dosyaya veri yazdırmak için kullanılır
        FileOutputStream ff = null;
        
        //1. yazım şekli
        /*
        File file = new File("bolum.txt"); // import java.io.File;
        ff = new FileOutputStream(file);
        */
            
        try {
            //2. yazım şekli
            ff = new FileOutputStream("bolum.txt", true); //bolum.txt dosyası yoksa eğer oluşturulur //bu işlem riskli olacağından ide try catch içinde yazmamızı istiyor
            // burada "true" ifadesi, dosyaya yazma işlemini her seferinde sıfırdan değil, var olan dosyadaki verilerin üstüne ekleyerek ilerlesin diye append: true ayarlanıyor
            
            try {
                //ff.write(65); //ide try catch içinde yazmamızı istiyor
                //ff.write(85);
                
                //byte[] veriler = {23, 34, 55};
                //ff.write(veriler);
                
                String ss = "Computer";
                byte[] dizi = ss.getBytes(); //ss değişkenini byte dizine dönüştüren metot !!!
                ff.write(dizi);
            }
            catch (IOException ex) {
                System.out.println("Veri yazılamadı.");
            }
            
        }
        catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        }
        finally {
            try {
                ff.close(); //kapatırken de hata olabilir diye ide bizden yine bu kısmı da try catch'e almamızı istiyor
            }
            catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu.");
            }
        }
    }
}
