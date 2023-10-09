import java.util.Scanner;
class SumAverage{
	void CalcSumAvg(int num1, int num2, int num3, int num4, int num5){
		int sum;
		sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("Sum of Numbers is : " + sum);	
		double average = (double) sum / 5;
		System.out.println("Average of Numbers is : " + average);
	}
	public static void main(String args[]){
		System.out.println("Program to calculate Sum and Average of Five numbers");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter second number : ");
		int num2 = scan.nextInt();
		System.out.print("Enter third number : ");
		int num3 = scan.nextInt();
		System.out.print("Enter fourth number : ");
		int num4 = scan.nextInt();
		System.out.print("Enter fifith number : ");
		int num5 = scan.nextInt();
		SumAverage obj = new SumAverage();
		obj.CalcSumAvg(num1, num2, num3, num4, num5);
	}
}