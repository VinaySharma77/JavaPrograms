import java.util.Scanner;
class SimpleCalculator{
	void Calculator(){
		System.out.println("Program to create a Simple Calculator");
		Scanner scan = new Scanner(System.in);
		System.out.println("Simple Calculator");
		System.out.println("----------------------------");
		while(true){
			System.out.print("Enter First Number : ");
			double first = scan.nextDouble();
			System.out.print("Enter an Operator or enter q to exit : ");
			char operator = scan.next().charAt(0);
			if(operator == 'q'){
				System.out.print("Calculator Exiting ");
				break;
			}
			System.out.print("Enter Second Number : ");
			double second = scan.nextDouble();
			double result;
			switch(operator){
				case '+':
					result = first + second;
					System.out.println("Addition is : " + result);
					break;
				case '-':
					result = first - second;
					System.out.println("Subtraction is : " + result);
					break;
				case '*':
					result = first * second;
					System.out.println("Multiplication is : " + result);
					break;
				case '/':
					if(second != 0){
						result = first / second;
						System.out.println("Division is : " + result);
						break;
					}
					else{
						System.out.println("Cannot divide by 0 !!");
						continue;
					}
				default:
					System.out.println("Please enter valid operator !!");
			}
		}
		
	}
	public static void main(String args[]){
		SimpleCalculator obj = new SimpleCalculator();
		obj.Calculator();
	}
}