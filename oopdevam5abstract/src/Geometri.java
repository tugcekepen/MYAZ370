public abstract class Geometri {
    private String sekil;

    public Geometri(String sekil) {
        this.sekil = sekil;
    }
    
    //somut metot
    public void SekilAd(){
        System.out.println(sekil + " geometrik şekildir.");
    }
    
    //soyut metot ---> bunu alt sınıfta mutlaka override etmeliyiz
    abstract void AlanHesapla(); //gövdesi yok!!

    public String getSekil() {
        return sekil;
    }

    public void setSekil(String sekil) {
        this.sekil = sekil;
    }
}
