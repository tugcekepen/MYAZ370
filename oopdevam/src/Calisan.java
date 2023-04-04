/**
 *
 * @author TugceK
 */
public class Calisan {
    private String ad;
    private double maas;
    private String bolum;

    public Calisan(String ad, double maas, String bolum) {
        this.ad = ad;
        this.maas = maas;
        this.bolum = bolum;
    }
    
    public void Goster(){
        System.out.println("Ad: " + getAd() + "\nMaaş: " + getMaas() + "\nBölüm: " + getBolum());
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the maas
     */
    public double getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(double maas) {
        this.maas = maas;
    }

    /**
     * @return the bolum
     */
    public String getBolum() {
        return bolum;
    }

    /**
     * @param bolum the bolum to set
     */
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    
    
}
