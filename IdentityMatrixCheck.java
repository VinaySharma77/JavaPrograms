import java.util.Scanner;
public class IdentityMatrixCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isIdentityMatrix = true;
        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                        isIdentityMatrix = false;
                        break;
                    }
                }
                if (!isIdentityMatrix) {
                    break;
                }
            }
        } else {
            isIdentityMatrix = false;
        }
        System.out.println("The given matrix is " + (isIdentityMatrix ? "an identity matrix." : "not an identity matrix."));
    }
}
