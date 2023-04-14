public class ElektMuh implements SAMUH {
    
    private boolean staj;

    public ElektMuh(boolean staj) {
        this.staj = staj;
    }
    
    @Override
    public String NotOrt(double ort) {
        return "Ortalaması : " + ort;
    }

    @Override
    public void StajSorgula() {
        if(staj){
            System.out.println("Staj yapıldı.");
        }else{
            System.out.println("Staj yapılmadı.");
        }
    }

    @Override
    public String KalanDers(int sayi) {
        return "Kalan ders sayısı : " + sayi;
    }

    @Override
    public void Projeler(String[] proje) {
        System.out.println("Projeler :");
        for (int i = 0; i < proje.length; i++) {
            System.out.println("- " + proje[i]);
        }
    }
}
