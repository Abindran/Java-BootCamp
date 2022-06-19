import java.util.Scanner;

public class Add2NumsUsers {
    public static void main(String[] args){
        int firstNumber,secondNumber,result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        firstNumber = input.nextInt();
        System.out.println("Enter the number 2: ");
        secondNumber = input.nextInt();
        result = firstNumber + secondNumber;
        System.out.println(result);
    }
}
