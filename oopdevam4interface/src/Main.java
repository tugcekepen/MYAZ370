
public class Main {
    public static void main(String[] args) {
        /* 
        interface : interfaceler içerisinde soyut metotlar üretiriz ve kendisini implemente eden sınıflarda bu metotların gövdelerini oluştururuz 
                    içerisindeki her metot override edilmeli, her özellik tanımlanmalıdır
        keyword : IMPLEMENTS
        */
        //SAMUH samüh = new SAMUH(); //---> Interface'lerden nesne üretilemez.
        /*
        ElektMuh eMuh1 = new ElektMuh(false);
        eMuh1.StajSorgula();
        System.out.println(eMuh1.NotOrt(3.5));
        System.out.println(eMuh1.KalanDers(5));
        String[] proje = {"BAP", "Tubitak-2242"};
        eMuh1.Projeler(proje);
        */
        //SAMUH eMuh2 = new ElektMuh(true); //---> bu şekilde nesne üretilebilir.
        
        YazMuh yMuh1 = new YazMuh(true);
        yMuh1.StajSorgula();
        System.out.println(yMuh1.NotOrt(3.1));
        System.out.println(yMuh1.KalanDers(1));
        String[] proje = {};
        yMuh1.Projeler(proje);
        String[] prog = {"Java", "C", "C++"};
        yMuh1.ProgramlamaDilleri(prog);
        System.out.println(yMuh1.Pc_Sayisi(5));
    }
}
