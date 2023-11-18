public class DoubleToString{
    public static void main(String[] args) {
        double number1 = 123.45;
        String str1 = Double.toString(number1);
        System.out.println("Method 1: Using Double.toString()");
        System.out.println("Original double: " + number1);
        System.out.println("Converted string: " + str1);
        double number2 = 67.89;
        String str2 = "" + number2;
        System.out.println("\nMethod 2: Concatenating with an empty string");
        System.out.println("Original double: " + number2);
        System.out.println("Converted string: " + str2);
    }
}
