import java.util.Scanner;
public class ArrayElementsAverage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        double average = calculateAverage(array);
        System.out.println("The average is: " + average);
    }
    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}
