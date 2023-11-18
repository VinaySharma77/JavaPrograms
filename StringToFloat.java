public class StringToFloat{
    public static void main(String[] args) {
        String floatString = "123.45";
        try {
            float floatValue = Float.parseFloat(floatString);
            System.out.println("Converted float value: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid float string");
            e.printStackTrace();
        }
    }
}
