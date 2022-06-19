public class BankUser {

    public static void main(String args[]){
        BankApp john = new BankApp("John",19);

        john.accTax("AC123");


        john.getUserInfo();

        //Inhertance is here

        SbiUser ram = new SbiUser("Ram");

        ram.accTax("AC123456778899");

        ram.getUserInfo();
    }
}
