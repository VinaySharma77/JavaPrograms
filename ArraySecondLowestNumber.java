import java.util.Arrays;
import java.util.Scanner;
public class ArraySecondLowestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Please enter at least two elements in the array.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int secondLowest = findSecondLowest(arr);
        System.out.println("The second lowest number in the array is: " + secondLowest);
    }
    private static int findSecondLowest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
}