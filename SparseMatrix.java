import java.util.Scanner;
public class SparseMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int countZeros = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    countZeros++;
                }
            }
        }
        if (countZeros > (rows * cols) / 2) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    }
}