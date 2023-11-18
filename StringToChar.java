public class StringToChar{
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char[] charArray = inputString.toCharArray();
        System.out.println("Original String: " + inputString);
        System.out.println("Converted to char array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
