import java.util.Scanner;
class DecimalToBinary{
	String decimalToBinary(int decimalNumber){
		if(decimalNumber == 0){
			return "0";
		}
		StringBuilder binary = new StringBuilder();
		while(decimalNumber > 0){
			int rem = decimalNumber % 2;
			binary.insert(0, rem);
			decimalNumber/=2;
		}
		return binary.toString();
	}
	void dec2bin(){
		int num;
		System.out.println("Program to convert decimal number to binary number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		num = scan.nextInt();
		String binary = decimalToBinary(num);
		System.out.println("Binary Representation of number is : " + binary);
	}
	public static void main(String args[]){
		DecimalToBinary obj = new DecimalToBinary();
		obj.dec2bin();
	}
}