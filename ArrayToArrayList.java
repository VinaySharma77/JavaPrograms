import java.util.ArrayList;
import java.util.Scanner;
public class ArrayToArrayList{
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
        ArrayList<Integer> arrayList = convertArrayToArrayList(array);
        System.out.println("ArrayList elements: " + arrayList);
    }
    private static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : array) {
            arrayList.add(value);
        }
        return arrayList;
    }
}
