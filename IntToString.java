import java.util.Scanner;
public class IntToString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        String strResult = Integer.toString(userInput);
        System.out.println("The integer as a string: " + strResult);
    }
}
