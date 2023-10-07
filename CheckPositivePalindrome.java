import java.util.Scanner;
class CheckPositivePalindrome{
	void checkPalindrome(){
		int num, rem, sum = 0, temp;
		System.out.println("Program to check positive palindrome number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = scan.nextInt();
		temp = num;
		while(num > 0){
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if(temp == sum && temp % 2 == 0){
			System.out.println("It is a Positive Palindrome Number");
		}
		else{
			System.out.println("It is not a Positive Palindrome Number");
		}
	}
	public static void main(String args[]){
		CheckPositivePalindrome obj = new CheckPositivePalindrome();
		obj. checkPalindrome();
	}
}