//Polymorphism

class Hayvan{
    //field
    private String ad;
    //ctor
    public Hayvan(String ad) {
        this.ad = ad;
    }
    //method
    public String Ses(){
        return "Hayvanlar ses çıkartır.";
    }
    //getter-setter
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
}

class Kedi extends Hayvan{
    
    public Kedi(String ad) {
        super(ad);
    }

    @Override
    public String Ses() {
        return this.getAd() + " miyavladı.";
    } 
}

class Kopek extends Hayvan{
    
    public Kopek(String ad) {
        super(ad);
    }

    @Override
    public String Ses() {
        return this.getAd() + " havladı.";
    } 
}

/*
public class Test {
    public static void main(String[] args) {
        Hayvan h1 = new Hayvan("Hayvan");
        System.out.println(h1.Ses());
        
        Hayvan h2 = new Kedi("Simba");
        System.out.println(h2.Ses());
        
        Hayvan h3 = new Kopek("Kara");
        System.out.println(h3.Ses());
    }
}
*/

public class Test {
    public static void Ses_Cikart(Hayvan hayvan) {
        System.out.println(hayvan.Ses());
    } 
    public static void main(String[] args) {
        Ses_Cikart(new Hayvan("Hayvan"));
        Ses_Cikart(new Kedi("Simba"));
        Ses_Cikart(new Kopek("Kara"));
    }
}