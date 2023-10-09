import java.util.Scanner;
class GreatestNumber{
	void CalcGreater(){
		System.out.println("Program to check greatest number from three numbers");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int first = scan.nextInt();
		System.out.print("Enter Second Number : ");
		int second = scan.nextInt();
		System.out.print("Enter Third Number : ");
		int third = scan.nextInt();
		if(first > second){
			if(first > third){
				System.out.print("First is greatest Number");
			}
		}
		else if(second > third){
			System.out.print("Second is greatest Number");
		}
		else{
			System.out.print("Third is greatest Number");
		}
	}
	public static void main(String args[]){
		GreatestNumber obj = new GreatestNumber();
		obj.CalcGreater();
	}
}