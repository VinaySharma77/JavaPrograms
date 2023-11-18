public class LongToInt{
    public static void main(String[] args) {
        long longValue = 123456789012345L;
        try {
            int intValue = (int) longValue;
            System.out.println("Original long value: " + longValue);
            System.out.println("Converted int value: " + intValue);
        } catch (ArithmeticException e) {
            System.out.println("Conversion failed: Long value is too large for int");
        }
    }
}
