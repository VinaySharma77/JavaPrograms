import java.util.Scanner;
class IntegerSquareRoot{
	void squareRoot(){
		int num, squareRoot;
		System.out.println("Program to calculate Square Root of an integer");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = scan.nextInt();
		squareRoot = num * num;
		System.out.println("Square Root of " + num + " is : " + squareRoot);
	}
	public static void main(String args[]){
		IntegerSquareRoot obj = new IntegerSquareRoot();
		obj.squareRoot();
	}
}