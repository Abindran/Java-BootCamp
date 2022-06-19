import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args){
        float fahTemp,celTemp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fahrenheit temperature: ");
        fahTemp = input.nextFloat();
        celTemp = (fahTemp-32) * 5/9;
        System.out.println("The Celsius temperature is " + celTemp);
    }
}
