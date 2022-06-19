import java.util.Scanner;
public class GradeGreetings {
    public static void main(String[] args){
        char grade;
        Scanner input = new Scanner(System.in);
        grade = input.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("Amazing job !!!");
                break;
            case 'B':
                System.out.println("You can do better");
                break;
            case 'C':
                System.out.println("Little more hard word");
                break;
            case 'D':
                System.out.println("oh! boy get serious");
                break;
            case 'E':
                System.out.println("Almost fail");
                break;
            case 'F':
                System.out.println("fail. Focus on studies");
                break;
            default:
                System.out.println("Grade can only be A to F");
        }
    }
}
