import java.util.Scanner;
public class RoundUpDivision{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        int result = (numerator + denominator - 1) / denominator;
        System.out.println("Result of rounding up division: " + result);
    }
}
