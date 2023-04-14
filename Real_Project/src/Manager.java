public class Manager {
    //DI
    private IUserControlService _userControlService;

    public Manager(IUserControlService _userControlService) {
        this._userControlService = _userControlService;
    }
    
    //ctor
    public void Manager(User user) {
        if(_userControlService.ControlUser(user))
            System.out.println(user.getName() + " isimli kişinin kayıt işlemi tamamlandı.");
        else
            System.out.println(user.getName() + " isimli kişinin kayıt işlemi tamamlanmadı.");
    }
}
