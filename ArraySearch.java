import java.util.Scanner;
public class ArraySearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the key element to search: ");
        int key = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                found = true;
                System.out.println("Key element found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Key element not found in the array.");
        }
    }
}
