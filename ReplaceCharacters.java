import java.util.Scanner;
class ReplaceCharacters{
	void Replace(){
		System.out.println("Program to Replace 'd' characters with 'f' characters");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String text = scan.nextLine();
		String replace = text.replaceAll("d","f");
		System.out.println("Original String is : " + text);
		System.out.println("Replaced String is : " + replace);
	}
	public static void main(String args[]){
		ReplaceCharacters obj = new ReplaceCharacters();
		obj.Replace();
	}
}