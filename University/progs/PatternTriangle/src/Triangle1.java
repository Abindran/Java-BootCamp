import java.util.Scanner;
public class Triangle1 {
    public static void main(String[] args){
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of rows: ");
        rows = input.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
