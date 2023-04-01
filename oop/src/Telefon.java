/**
 *
 * @author TugceK
 */
public class Telefon {
    private String renk;
    private String marka;
    private String isletim;
    private double fiyat;
    private int boyut;
    
    //örneğin marka field'ına erişebilmek için setter ve getter üretelim
    public void setMarka(String marka){
        this.marka = marka;
    }
    public String getMarka(){
        return marka;
    }
    //artık main class'ında marka için atama yapabileceğiz
    
    //ama her field için her seferinde böyle tek tek setter getter yazamayız.
    //mouse sağ tık --> Refactor --> Encapsulate Fields...

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the isletim
     */
    public String getIsletim() {
        return isletim;
    }

    /**
     * @param isletim the isletim to set
     */
    public void setIsletim(String isletim) {
        this.isletim = isletim;
    }

    /**
     * @return the fiyat
     */
    public double getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(double fiyat) {
        if(fiyat<0){
            System.out.println("Fiyat 0'dan az olamaz.");
        }
        else{
            this.fiyat = fiyat;
        }
    }

    /**
     * @return the boyut
     */
    public int getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }
    
    
    //constructor
    //Mouse sağ tık --> Insert code... --> Constructor...
    //Alt+Insert --> Constructor...
    
    //eğer parametreli ctor'umuz olacaksa, default ctor'u mutlaka bulundurmalıyız.
    
    //default ctor
    public Telefon(){
        /*
        this.renk = "Girilmedi";
        this.marka = "Girilmedi";
        this.isletim = "Girilmedi";
        this.fiyat = 0.0;
        this.boyut = 0;
        */
        this("Girilmedi", "Girilmedi", "Girilmedi", 0.0, 0); //ctor içerisinde başka bir ctor'u çağırma !!!!
    }
    
    //parametreli ctor
    public Telefon(String renk, String marka, String isletim, double fiyat, int boyut){
        this.renk = renk;
        this.marka = marka;
        this.isletim = isletim;
        this.fiyat = fiyat;
        this.boyut = boyut;
    }
    
    public Telefon(String renk, String marka, double fiyat){
        /*
        this.renk = renk;
        this.marka = marka;
        this.fiyat = fiyat;
        */
        this(renk, marka, "Girilmedi", fiyat, 0);
    }
    
    public void Goster(){
        System.out.println("Renk: " + renk + "\nMarka: " + marka + "\nİşletim sistemi: " + isletim + "\nFiyat: " + fiyat + "\nBoyut: " +boyut);
    }
    
}
