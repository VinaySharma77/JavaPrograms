import java.util.Scanner;
class Factorial{
	void factorial(){
		System.out.println("Program to Find Factorial of a Number");
		Scanner scan = new Scanner(System.in);
		int num, fact = 1, i;
		System.out.print("Enter a number : ");
		num = scan.nextInt();
		for(i = 1; i <= num; i++){
			fact *= i;
		} 
		System.out.println("Factorial of " + num + " is : " + fact);
	}
	public static void main(String args[]){
		Factorial obj = new Factorial();
		obj.factorial();
	}
}