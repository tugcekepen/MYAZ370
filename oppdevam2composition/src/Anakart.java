public class Anakart {
    private String model;
    private String uretici;

    public Anakart(String model, String uretici) {
        this.model = model;
        this.uretici = uretici;
    }
    
    public void IslteimSistemi(String isletimSistemi){
        System.out.println("İşletim sistemi : " + isletimSistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
}
