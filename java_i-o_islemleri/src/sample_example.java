
import java.io.FileWriter;
import java.io.IOException;


public class sample_example {
    public static void main(String[] args) {
        try(FileWriter ff = new FileWriter("bolum.txt", true)){
            ff.write("Muhendislik Fakultesi\n");
            ff.write("Yazılım Muh");
        }
        catch (IOException ex){
            System.out.println("Dosya oluşturma anında hata oluştu.");
        }
    }
}
