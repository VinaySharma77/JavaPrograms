import java.util.Scanner;
public class SumOfEvenOddElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the integers in the set:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
