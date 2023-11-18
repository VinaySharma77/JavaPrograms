public class LongToString{
    public static void main(String[] args) {
        long myLong = 123456789L;
        String stringValueOf = String.valueOf(myLong);
        System.out.println("Using String.valueOf(): " + stringValueOf);
        String stringConcatenation = "" + myLong;
        System.out.println("Using concatenation with an empty string: " + stringConcatenation);
        String toStringMethod = Long.toString(myLong);
        System.out.println("Using Long.toString(): " + toStringMethod);
    }
}
