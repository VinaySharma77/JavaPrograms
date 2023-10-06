import java.util.Scanner;
class SumOfDigits{
	void CalculateSum(){
		int num, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Program to find sum of digits of a number");
		System.out.print("Enter a number : ");
		num = scan.nextInt();
		int temp = num;
		while(temp != 0){
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}		
		System.out.println("Sum of Digits : " + sum);
	}
	public static void main(String args[]){
		SumOfDigits obj = new SumOfDigits();
		obj.CalculateSum();
	}
}