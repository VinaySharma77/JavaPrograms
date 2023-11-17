import java.util.Scanner;
public class RoundFloat2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float inputNumber = scanner.nextFloat();
        float roundedNumber = Math.round(inputNumber);
        System.out.println("Rounded value: " + roundedNumber);
    }
}
