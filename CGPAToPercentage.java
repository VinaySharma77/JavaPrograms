import java.util.Scanner;
class CGPAToPercentage{
	void CalcPer(){
		System.out.println("Program to calculate CGPA to Percentage");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter CGPA out of 10 : ");
		double cgpa = scan.nextDouble();
		double percentage = cgpa * 9.5; //formula can vary between institutions
		System.out.println("Your percentage is : " + percentage + " % ");
	}
	public static void main(String args[]){
		CGPAToPercentage obj = new CGPAToPercentage();
		obj.CalcPer();
	}
}