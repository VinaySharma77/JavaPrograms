import java.util.Scanner;
public class CheckDoubleIsInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double number: ");
        double number = scanner.nextDouble();
        if (number % 1 == 0) {
            System.out.println(number + " is an integer.");
        } else {
            System.out.println(number + " is not an integer.");
        }
    }
}
