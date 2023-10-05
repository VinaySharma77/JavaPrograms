public class ArithmeticOperations{
	int num1 = 50, num2 = 10;
	void sum(){
		int sum;
		sum = num1 + num2;
		System.out.println("Sum of two numbers is : " + sum);
	}
	void division(){
		int division;
		division = num1 / num2;
		System.out.println("Division of two numbers is : " + division);
	}
	void multiply(){
		int multiply;
		multiply = num1 * num2;
		System.out.println("Multiplication of two numbers is : " + multiply);
	}
	void subtract(){
		int subtract;
		subtract = num1 - num2;
		System.out.println("Subtraction of two numbers is : " + subtract);
	}
	public static void main(String args[]){
		ArithmeticOperations obj = new ArithmeticOperations();
		System.out.println("First Number is : " + obj.num1);
		System.out.println("Second Number is : " + obj.num2);
		obj.sum();
		obj.division();
		obj.multiply();
		obj.subtract();
	}
}