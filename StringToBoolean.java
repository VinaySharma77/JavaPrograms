public class StringToBoolean{
    public static void main(String[] args) {
        String stringValue = "true";
        boolean booleanValue = Boolean.parseBoolean(stringValue);
        System.out.println("String value: " + stringValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}
