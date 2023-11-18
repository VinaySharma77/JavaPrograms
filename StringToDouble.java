public class StringToDouble{
    public static void main(String[] args) {
        String doubleString = "123.45";
        try {
            double convertedDouble = Double.parseDouble(doubleString);
            System.out.println("Converted double: " + convertedDouble);
        } catch (NumberFormatException e) {
            System.out.println("Invalid double string format");
        }
    }
}
