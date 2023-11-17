import java.util.Scanner;
public class NumberCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        boolean continueInput = true;
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            int number = scanner.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to enter another number? (yes/no): ");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("no")) {
                continueInput = false;
            }
        } while (continueInput);
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}
