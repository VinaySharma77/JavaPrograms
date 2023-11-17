import java.util.Arrays;
import java.util.Scanner;
public class DescendingOrderArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(array));
    }
}
