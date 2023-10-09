import java.util.Scanner;
class OddNaturalNumbersSum{
	void Calc(){
		System.out.println("Program to Print Odd Natural Number's and their Sum upto N");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of N : ");
		int n = scan.nextInt();
		int i, sum = 0, odd = 1;
		System.out.print("First " + n + " Natural Numbers are : ");
		for(i = 1; i <= n; i++){
			System.out.print(odd + " , ");
			sum += odd;
			odd += 2;
			if(odd > n){
				break;
			}
		}
		System.out.println("\nSum of all " + n + " Natural Numbers is : " + sum);
	}
	public static void main(String args[]){
		OddNaturalNumbersSum obj = new OddNaturalNumbersSum();
		obj.Calc();
	}
}