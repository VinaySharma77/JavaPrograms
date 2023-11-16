import java.util.Scanner;
public class LineCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (press Ctrl+D or Ctrl+Z to finish input):");
        StringBuilder inputStringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            inputStringBuilder.append(scanner.nextLine()).append("\n");
        }
        String userInput = inputStringBuilder.toString();
        int lineCount = countLines(userInput);
        System.out.println("Total number of lines: " + lineCount);
    }
    private static int countLines(String input) {
        String[] lines = input.split("\n");
        return lines.length;
    }
}
