import java.util.Scanner;
import java.util.regex.Pattern;
public class RemoveHtmlTags{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with HTML tags: ");
        String input = scanner.nextLine();
        String result = removeHtmlTags(input);
        System.out.println("String without HTML tags: " + result);
    }
    private static String removeHtmlTags(String input){
        String regex = "<[^>]*>";
        return input.replaceAll(regex, "");
    }
}
