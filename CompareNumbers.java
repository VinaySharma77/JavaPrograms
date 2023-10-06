import java.util.Scanner;
class CompareNumbers{
	void checkEqual(){
		int num1, num2;
		System.out.println("Program to compare two numbers");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1 = scan.nextInt();
		System.out.print("Enter second number : ");
		num2 = scan.nextInt();
		if(num1 == num2){
			System.out.println("Both numbers are equal");
		}
		else{
			System.out.println("Numbers are not equal");
		}
	}
	public static void main(String args[]){
		CompareNumbers obj = new CompareNumbers();
		obj.checkEqual();
	}
}