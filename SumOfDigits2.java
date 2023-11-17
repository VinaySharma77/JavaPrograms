import java.util.Scanner;
public class SumOfDigits2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = computeDigitSum(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }
    public static int computeDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
