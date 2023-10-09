import java.util.Scanner;
class CheckPositiveNegative{
	void CheckNumber(){
		System.out.println("Program to Check Number is Positive or Negative");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		if(num > 0){
			System.out.println("It is a Positive Number");
		}
		else if(num < 0){
			System.out.println("It is a Negative Number");
		}
		else{
			System.out.println("Number is zero");
		}
	}
	public static void main(String args[]){
		CheckPositiveNegative obj = new CheckPositiveNegative();
		obj.CheckNumber();
	}
}