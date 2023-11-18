public class BooleanToString{
    public static void main(String[] args) {
        boolean boolValue = true;
        String stringValue1 = String.valueOf(boolValue);
        System.out.println("Using String.valueOf(): " + stringValue1);
        boolean anotherBoolValue = false;
        String stringValue2 = "" + anotherBoolValue;
        System.out.println("Concatenating with an empty string: " + stringValue2);
    }
}
