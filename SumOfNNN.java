import java.util.Scanner;
class SumOfNNN{
	public static void main(String args[]){
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Program to compute value of n+nn+nnn");
		System.out.print("Enter an integer : ");
		n = scan.nextInt();
		int nn = n * 10 + n; //110
		int nnn = n * 100 + nn;//1110
		int result = n + nn + nnn;
		System.out.println("Sum n + nn + nnn is : " + result);
	}
}