public class Cember extends Geometri{
    private int yaricap;

    public Cember(int yaricap, String sekil) {
        super(sekil);
        this.yaricap = yaricap;
    }

    @Override
    void AlanHesapla() {
        System.out.println(getSekil() + " alanı : " + (Math.PI*yaricap*yaricap));
    }
}
