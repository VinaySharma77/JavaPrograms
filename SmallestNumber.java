import java.util.Scanner;
public class SmallestNumber{
    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        int smallestNumber = findSmallestNumber(number1, number2, number3);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
