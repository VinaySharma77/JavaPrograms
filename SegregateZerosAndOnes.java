import java.util.Scanner;
public class SegregateZerosAndOnes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements (0 or 1) of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] != 0 && array[i] != 1) {
                System.out.println("Invalid input. Please enter 0 or 1.");
                i--; // Decrement i to re-enter the current index
            }
        }
        segregateZerosAndOnes(array);
        System.out.println("Segregated Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    private static void segregateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
            }
            while (array[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}