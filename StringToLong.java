public class StringToLong{
    public static void main(String[] args) {
        String strNumber = "123456789";
        try {
            long longNumber = Long.parseLong(strNumber);
            System.out.println("Converted long value: " + longNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the string as a long.");
            e.printStackTrace();
        }
    }
}
