import java.util.Scanner;
public class NoteCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int[] denominations = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int[] notesCount = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
        System.out.println("Total number of notes:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + " : " + notesCount[i]);
            }
        }
    }
}
