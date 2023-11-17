import java.util.Scanner;
public class PentagonArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side of the pentagon:");
        double sideLength = scanner.nextDouble();
        double area = calculatePentagonArea(sideLength);
        System.out.println("The area of the pentagon is: " + area);
    }
    public static double calculatePentagonArea(double sideLength) {
        return (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(sideLength, 2);
    }
}
