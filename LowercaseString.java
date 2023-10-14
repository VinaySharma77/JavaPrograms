import java.util.Scanner;
class LowercaseString{
	void ConvertString(){
		System.out.println("Program to Convert String to Lowercase");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String text = scan.nextLine();
		String result = text.toLowerCase();
		System.out.println("Lowercase String is : " + result);
	}
	public static void main(String args[]){
		LowercaseString obj = new LowercaseString();
		obj.ConvertString();
	}
}