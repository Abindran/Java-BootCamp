import java.util.Scanner;

public class Compare2Nums {

    public static void main(String[] args){
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        num1 = input.nextInt();
        System.out.println("Enter the value of num2: ");
        num2 = input.nextInt();
        if(num1>num2){
            System.out.println("The number 1 is greater than number 2");
        } if(num1<num2){
            System.out.println("The number 1 is lesser than number 2");
        } else {
            System.out.println("The number 1 is equal to number 2");
        }
    }
}
