import java.util.Scanner;
public class MinMaxNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        char choice;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Smallest number entered: " + smallest);
        System.out.println("Largest number entered: " + largest);
    }
}
