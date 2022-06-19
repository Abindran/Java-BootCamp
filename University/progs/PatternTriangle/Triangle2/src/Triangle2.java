import java.util.Scanner;
public class Triangle2 {
    public static void main(String[] args){
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = input.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=rows;j>i;j--){
                System.out.print("*");
            }
            System.out.print('\n');

        }
    }
}
