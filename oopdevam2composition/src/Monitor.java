public class Monitor {
    private String marka;
    private String model;
    private Cozunurluk cozunurluk; //composition

    public Monitor(String marka, String model, Cozunurluk cozunurluk) {
        this.marka = marka;
        this.model = model;
        this.cozunurluk = cozunurluk;
    }
    
    public void Monitor_Ac(){
        System.out.println("Monitör açılıyor...");
    }
    public void Monitor_Kapat(){
        System.out.println("Monitoör kapatılıyor...");
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

    public Cozunurluk getCozunurluk() {
        return cozunurluk;
    }

    public void setCozunurluk(Cozunurluk cozunurluk) {
        this.cozunurluk = cozunurluk;
    }
}
