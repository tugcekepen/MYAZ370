
import java.io.FileWriter;
import java.io.IOException;


public class fileWriter_example {
    public static void main(String[] args) {
        //FileWriter'da byte char dönüşümlerine gerek yok
        FileWriter ww=null;
        
        try {
            ww = new FileWriter("bolum.txt>");
            ww.write("Muhendislik Fakultesi\n");
            ww.write("Yazılım Muh");
        }
        catch (IOException ex) {
            System.out.println("Dosya bulunamadı");
        }
        finally {
            try {
                if(ww!=null){
                    ww.close();
                }
            }
            catch (IOException ex) {
                System.out.println("Dosya kapatılamadı.");
            }
        }
    }
}
