import java.util.Scanner;
class SwapNumbers{
	void swap(){
		int num1, num2, temp;
		System.out.println("Program to swap two numbers");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1 = scan.nextInt();
		System.out.print("Enter second number : ");
		num2 = scan.nextInt();
		System.out.println("Before Swapping Number1 is : " + num1);
		System.out.println("Before Swapping Number2 is : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping Number1 is : " + num1);
		System.out.println("After Swapping Number2 is : " + num2);
	}
	public static void main(String args[]){
		SwapNumbers obj = new SwapNumbers();
		obj.swap();
	}
}