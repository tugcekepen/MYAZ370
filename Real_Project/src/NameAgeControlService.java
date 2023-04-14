public class NameAgeControlService implements IUserControlService{

    @Override
    public boolean ControlUser(User user) {
        if(user.getAge()>=18 && user.getName().startsWith("T"))
            return true;
        return false;
    }
    
}
