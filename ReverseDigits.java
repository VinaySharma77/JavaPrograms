import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = reverseDigits(number);
        System.out.println("Number with reversed digits: " + reversedNumber);
    }
    private static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }
}
