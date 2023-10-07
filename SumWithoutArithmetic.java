class SumWithoutArithmetic{
	void SumWithoutArithmetic(){
		int num1 = 10, num2 = 20;
		while(num1 != 0){
			int carry = (num1 & num2);
			num2 = num2 ^ num1;
			num1 = carry << 1;
		}
		System.out.println("Sum of two numbers is : " + num2);
	}
	public static void main(String args[]){
		SumWithoutArithmetic obj = new SumWithoutArithmetic();
		obj.SumWithoutArithmetic();
	}
}