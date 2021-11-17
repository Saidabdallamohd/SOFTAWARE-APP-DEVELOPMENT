import java.util.Scanner;

public class TemperatureQ9 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        double celcius = temp.nextDouble();
        double F = (9/5) * celcius +32;
        System.out.println("Fahrenheit is: " + F);
    }
}
