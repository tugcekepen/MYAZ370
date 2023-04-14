
public class YazMuh implements SAMUH, SAMU //birden fazla interface'i implemente ediyoruz
{
    private boolean staj;

    public YazMuh(boolean staj) {
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
        if(proje.length==0){
            System.out.println("Proje bulunmamaktadır.");
        }else{
            System.out.println("Projeler :");
            for (int i = 0; i < proje.length; i++) {
                System.out.println("- " + proje[i]);
            }
        }
    }
    
    public void ProgramlamaDilleri(String[] array){
        if(array.length==0){
            System.out.println("Herhangi bir dil bilmiyor.");
        }else{
            System.out.println("Programlama Dilleri :");
            for (int i = 0; i < array.length; i++) {
                System.out.println("- " + array[i]);
            }
        }
    }

    @Override
    public String Pc_Sayisi(int sayi) {
        return "Pc sayısı : "+ sayi;
    }
}
