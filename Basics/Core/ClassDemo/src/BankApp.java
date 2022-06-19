public class BankApp {
    String name;
    int age;
    String taxDetail;
    double amount;

    //Constructor
    public BankApp(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void accTax(String taxDetail){
        this.taxDetail = taxDetail;
    }

    public void depositAmount(double amount){
        this.amount = amount;
    }

    public void getUserInfo(){
        System.out.println("Name of the user: " + name);
        System.out.println("Age of the user: " + age);
    }

}


