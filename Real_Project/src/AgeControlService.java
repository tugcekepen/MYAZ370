public class AgeControlService implements IUserControlService {
    //IUserControlService'dan implemente edilen metot
    public boolean ControlUser(User user) {
        if(user.getAge()>=18)
            return true;
        return false;
    }
}
