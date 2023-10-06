class StringToInteger{
	public static void main(String args[]){
		System.out.println("Program to convert string to integer");
		String string1 = "10", string2 = "10";
		System.out.println("First String is : " + string1);
		System.out.println("Second String is : " + string2);
		System.out.println("Before conversion sum of string is : " + string1 + string2);
		int num1 = Integer.valueOf(string1);
		int num2 = Integer.valueOf(string2);
		System.out.println("After conversion sum of variables is :  " + (num1 + num2));
	}	
}