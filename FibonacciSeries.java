import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");
            printFibonacciSeries(n);
        }
    }
    private static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}