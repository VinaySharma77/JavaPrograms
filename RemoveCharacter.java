import java.util.Scanner;
class RemoveCharacter {
    public static void main(String args[]){
        	System.out.println("Program to Remove Specified Character from the String");
        	Scanner scan = new Scanner(System.in);
        	System.out.print("Enter the String : ");
        	String text = scan.nextLine(); // Corrected to nextLine() to read a string
        	if (text == null || text.isEmpty()) {
            		System.out.println("Please Enter the String");
        	}
	else{
            		System.out.print("Enter a character that you want to remove : ");
            		char ch = scan.next().charAt(0);
            		StringBuilder newstr = new StringBuilder();
            		for (int i = 0; i < text.length(); i++) {
                		if (text.charAt(i) == ch) {
                    			continue;
                		}
			else{
                    			newstr.append(text.charAt(i));
                		}
            		}
            		System.out.println("Original String is : " + text);
            		System.out.println("After Removing " + ch + " String is : " + newstr);
        	}
        	scan.close();
    }
}
