import java.util.Scanner;
public class FloatToAbsoluteValue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        float inputValue = scanner.nextFloat();
        float absoluteValue = Math.abs(inputValue);
        System.out.println("Absolute value: " + absoluteValue);
    }
}
