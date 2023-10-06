import java.util.Scanner;
class BinaryToDecimal{
	int binaryToDecimal(String binaryString){
		int decimal = 0;
		int binaryLength = binaryString.length();
		for(int i = 0; i < binaryLength; i++){
			char binaryDigit = binaryString.charAt(i);
			if(binaryDigit != '0' && binaryDigit != '1'){
				System.out.println("Invalid Binary Input !!");
				return -1;
			}
			int power = binaryLength - 1 - i;
			int digit = binaryDigit == '1' ? 1 : 0;
			decimal += digit * Math.pow(2, power);
		}
		return decimal;
	}
	void binaryToDecimal(){
		System.out.println("Program to convert binary number to decimal number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a binary number : ");
		String binaryString = scan.nextLine();
		int decimal = binaryToDecimal(binaryString);
		if(decimal != -1){
			System.out.println("Decimal Number is : " + decimal);
		}
	}
	public static void main(String args[]){
		BinaryToDecimal obj = new BinaryToDecimal();
		obj.binaryToDecimal();
	}
}