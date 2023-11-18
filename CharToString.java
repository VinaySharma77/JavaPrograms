public class CharToString{
    public static void main(String[] args) {
        char myChar1 = 'A';
        String convertedString1 = Character.toString(myChar1);
        System.out.println("Method 1: " + convertedString1);
        char myChar2 = 'B';
        String convertedString2 = "" + myChar2;
        System.out.println("Method 2: " + convertedString2);
    }
}
