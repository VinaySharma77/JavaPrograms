public class ArmstrongNumbers{
    public static void main(String[] args) {
        for (int i = 1; i <= 600; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = countDigits(number);
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
    private static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}