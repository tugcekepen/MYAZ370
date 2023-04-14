public class Main {
    public static void main(String[] args) {
        //artık Manager sınıfını istediğimiz herh bir kontrol servisiyle çalıştırabiliriz. Yeter ki IUserControlService'i implemente ediyor olsunlar!!
        // 1
        Manager sign = new Manager(new AgeControlService());
        sign.Manager(new User("Tuğçe", 25));
        // 2
        Manager sign2 = new Manager(new NameAgeControlService());
        sign2.Manager(new User("Ayşe", 25));
    }
}
