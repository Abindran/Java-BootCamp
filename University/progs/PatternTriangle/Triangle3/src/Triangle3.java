import java.util.Scanner;
public class Triangle3 {
    public static void main(String[] args){
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = input.nextInt();
        for (int i=rows;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
