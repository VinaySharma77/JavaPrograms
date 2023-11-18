import java.util.Scanner;
public class DecimalToOctal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Octal equivalent: " + octalNumber);
    }
}
