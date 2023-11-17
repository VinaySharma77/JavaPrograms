import java.util.Scanner;
public class RoundFloat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float number = scanner.nextFloat();
        System.out.print("Enter the number of decimal places: ");
        int decimalPlaces = scanner.nextInt();
        float roundedNumber = roundToDecimalPlaces(number, decimalPlaces);
        System.out.println("Rounded number: " + roundedNumber);
    }
    private static float roundToDecimalPlaces(float number, int decimalPlaces) {
        float factor = (float) Math.pow(10, decimalPlaces);
        return Math.round(number * factor) / factor;
    }
}
