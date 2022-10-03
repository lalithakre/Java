import java.util.*;
public class FahrenheitToCelsius 
{
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter temperatue in Fahrenheit");
        temperature = in.nextInt();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperatue in Celsius = " + temperature);
        }    
}
