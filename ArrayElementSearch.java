import java.util.Arrays;
import java.util.Scanner;
public class ArrayElementSearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter a value to search for: ");
        int targetValue = scanner.nextInt();
        boolean containsValue = Arrays.stream(numbers).anyMatch(value -> value == targetValue);
        System.out.println("The array " + (containsValue ? "contains" : "does not contain") + " the value " + targetValue);
    }
}
