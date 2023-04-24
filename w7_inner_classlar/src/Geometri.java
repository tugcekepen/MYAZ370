public class Geometri {
    
    private double pi = Math.PI;
    
    public class Ucgen {
        public void alan(int taban, int yukseklik){
                System.out.println("Alan = " + taban*yukseklik/2);
        }
    }
    
    public class Dortgen {
        public class Dikdortgen {
            public void alan(int ukenar, int kkenar){
                System.out.println("Alan = " + ukenar*kkenar);
            }
        }
        public class Kare {
            public void alan(int kenar){
                System.out.println("Alan = " + kenar*kenar);
            }
        }
    }
    
    public class Daire {
        public void alan(int yaricap){
                System.out.println("Alan = " + pi*yaricap*yaricap);
        }
    }
    
    //static class
    public static class Alan {
        private static double pi = Math.PI;
        // private double pi = Math.PI; tanımlaması daire_alan() metodunda hataya sebep olur çünkü static yapı içerisinde static olmayan bir şeye referans verilemez.
        
        public static void kare_alan(int kenar){
            System.out.println("Kare alan = " + kenar*kenar);
        }
        
        public static void daire_alan(int yaricap){
            System.out.println("Kare alan = " + pi*yaricap*yaricap);
        }
    }
}
