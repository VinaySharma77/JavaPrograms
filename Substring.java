import java.util.Scanner;
class Substring{
	void getSubstring(){
		System.out.println("Program to Print Substring from a String");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String text = scan.nextLine();
		System.out.print("Enter Starting Index : ");
		int start = scan.nextInt();
		System.out.print("Enter Ending Index : ");
		int end = scan.nextInt();
		int i;
		if(start < 0 || end > text.length() || start > end){
			System.out.println("Enter valid Index");
		}
		String substr = text.substring(start, end);
		System.out.println("Original String is : " + text);
		System.out.println("Substring is : " + substr);
	}
	public static void main(String args[]){
		Substring obj = new Substring();
		obj.getSubstring();
	}
}