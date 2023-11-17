import java.util.Scanner;
public class TriangularMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (square matrix): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i >= j) ? matrix[i][j] + " " : "0 ");
            }
            System.out.println();
        }
    }
}
