import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int num,res=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        num = input.nextInt();
        for (int i=num;num>0;i--){
            res *= i;
            num -= 1;
        }
        System.out.println("The Factorial is " + res);
    }
}
