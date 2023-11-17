import java.util.Scanner;
public class SeriesSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();
        int seriesSum = calculateSeriesSum(n, a, d);
        System.out.println("The sum of the series is: " + seriesSum);
    }
    private static int calculateSeriesSum(int n, int a, int d) {
        return (n / 2) * (2 * a + (n - 1) * d);
    }
}
