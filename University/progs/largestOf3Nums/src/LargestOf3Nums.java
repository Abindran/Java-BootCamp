import java.util.Scanner;
public class LargestOf3Nums {
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = input.nextInt();
        System.out.println("Enter the number 3: ");
        num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is greater");
        }else if (num2 > num3){
            System.out.println(num2 + " is greater");
        }else{
            System.out.println(num3 + " is greater");
        }
    }
}
