public class DoubleToInt{
    public static void main(String[] args) {
        double doubleValue = 123.45;
        int intValue1 = (int) doubleValue;
        System.out.println("Converted using type casting: " + intValue1);
        double doubleValue2 = 678.90;
        int intValue2 = (int) Math.round(doubleValue2);
        System.out.println("Converted using Math.round(): " + intValue2);
    }
}
