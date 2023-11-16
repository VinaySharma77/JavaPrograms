import java.util.*;
public class ArrayUniqueElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Unique elements in the array:");
        printUniqueElements(array);
    }
    private static void printUniqueElements(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            if (uniqueSet.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}