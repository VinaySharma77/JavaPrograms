import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class ArraysCommonElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements for the first array (comma-separated): ");
        String input1 = scanner.nextLine();
        String[] array1 = input1.split(",\\s*");
        System.out.print("Enter elements for the second array (comma-separated): ");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(",\\s*");
        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));
        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}
