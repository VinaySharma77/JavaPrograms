import java.util.Scanner;
public class RomanToInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            int value = getValue(romanNumeral.charAt(i));
            if (i < romanNumeral.length() - 1) {
                int nextValue = getValue(romanNumeral.charAt(i + 1));
                if (value < nextValue) {
                    result += (nextValue - value);
                    i++;
                    continue;
                }
            }
            result += value;
        }
        System.out.println("Integer equivalent: " + result);
    }
    private static int getValue(char romanDigit) {
        switch (romanDigit) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
