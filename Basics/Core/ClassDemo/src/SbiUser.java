public class SbiUser extends BankApp{

    public SbiUser(String name){
        super(name,19);
    }

    @Override
    public void  getUserInfo(){
        super.getUserInfo();
        System.out.println("Tax Details is " + taxDetail);
    }
}
