import java.util.Scanner;
class StringLength{
	void getLength(){
		System.out.println("Program to Count Length of a String");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String text = scan.nextLine();
		int count = text.length();
		System.out.println("String is : " + text);
		System.out.println("String Length is : " + count);
	}
	public static void main(String args[]){
		StringLength obj = new StringLength();
		obj.getLength();
	}
}