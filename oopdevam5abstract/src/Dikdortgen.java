public class Dikdortgen extends Geometri{
    
    private int uzunluk;
    private int genislik;

    public Dikdortgen(int uzunluk, int genislik, String sekil) {
        super(sekil);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    void AlanHesapla() {
        System.out.println(getSekil() + " alanı : " + (uzunluk*genislik));
    }
}
