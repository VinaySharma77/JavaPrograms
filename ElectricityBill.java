import java.util.Scanner;
class ElectricityBill{
	void CalcBill(){
		System.out.println("Program to calculate Electricity Bill");
		Scanner scan = new Scanner(System.in);
		double rate, unit, total;
		System.out.print("Enter the rate per unit (in rupees) : ");
		rate = scan.nextInt();
		System.out.print("Enter the number of units consumed : ");
		unit = scan.nextInt();
		total = rate * unit;
		System.out.println("Total Electricity Bill is : " + total);
	}
	public static void main(String args[]){
		ElectricityBill obj = new ElectricityBill();
		obj.CalcBill();
	}
}