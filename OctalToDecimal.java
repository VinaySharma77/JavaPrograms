import java.util.Scanner;
public class OctalToDecimal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.nextLine();
        System.out.println("Decimal equivalent: " + convertOctalToDecimal(octalNumber));
    }
    private static int convertOctalToDecimal(String octalNumber) {
        int decimalNumber = 0, length = octalNumber.length();
        for (int i = 0; i < length; i++) {
            decimalNumber += Character.getNumericValue(octalNumber.charAt(i)) * Math.pow(8, length - 1 - i);
        }
        return decimalNumber;
    }
}
