import java.util.Arrays;
import java.util.Scanner;
public class InsertElementInArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the position to insert the new element: ");
        int position = scanner.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Please enter a valid position.");
            return;
        }
        System.out.print("Enter the new element to insert: ");
        int newElement = scanner.nextInt();
        array = Arrays.copyOf(array, array.length + 1);
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = newElement;
        System.out.println("Array after inserting the new element: " + Arrays.toString(array));
    }
}
