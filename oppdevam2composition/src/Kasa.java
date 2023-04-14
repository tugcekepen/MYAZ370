public class Kasa {
    private String marka;
    private String model;

    public Kasa(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
    
    public void Kasa_Ac(){
        System.out.println("Bilgisayar açılıyor...");
    }
    public void Kasa_Kapat(){
        System.out.println("Bilgisayar kapatılıyor...");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
