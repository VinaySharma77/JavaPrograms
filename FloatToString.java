public class FloatToString{
    public static void main(String[] args) {
        float floatValue = 123.45f;
        String stringValue1 = Float.toString(floatValue);
        System.out.println("Method 1: Using Float.toString() - Result: " + stringValue1);
        float anotherValue = 67.89f;
        String stringValue2 = "" + anotherValue;
        System.out.println("Method 2: Concatenating with an empty string - Result: " + stringValue2);
    }
}
