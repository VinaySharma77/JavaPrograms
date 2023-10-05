import java.util.Scanner;
class NumbersProduct{
	void Product(){
		int num1, num2, product;
		System.out.print("Enter first number : ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		System.out.print("Enter second number : ");
		num2 = scan.nextInt();
		product = num1 * num2;
		System.out.println("Product of two number is : " + product);
	}
	public static void main(String args[]){
		NumbersProduct obj = new NumbersProduct();
		obj.Product();
	}
}