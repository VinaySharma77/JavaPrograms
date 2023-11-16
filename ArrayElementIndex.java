import java.util.Scanner;
public class ArrayElementIndex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int targetElement = scanner.nextInt();
        int index = findElementIndex(array, targetElement);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    private static int findElementIndex(int[] array, int targetElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                return i;
            }
        }
        return -1;
    }
}
