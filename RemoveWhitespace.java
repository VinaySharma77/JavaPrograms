import java.util.Scanner;
class RemoveWhitespace{
	void RemoveSpace(){
		System.out.println("Program to Remove Whitespaces from a String");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a paragraph : ");
		String para = scan.nextLine();
		String result = para.replaceAll("\\s+","");
		System.out.println("Original String is : " + para);
		System.out.println("Trimmed String is : " + result);
	}
	public static void main(String args[]){
		RemoveWhitespace obj = new RemoveWhitespace();
		obj.RemoveSpace();
	}
}