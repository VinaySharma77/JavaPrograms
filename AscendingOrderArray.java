import java.util.Arrays;
import java.util.Scanner;
public class AscendingOrderArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(array));
    }
}
