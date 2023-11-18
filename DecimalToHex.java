import java.util.Scanner;
public class DecimalToHex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String hexadecimal = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }
}
