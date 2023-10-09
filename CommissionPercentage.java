import java.util.Scanner;
class CommissionPercentage{
	void CalcCommission(){
		System.out.println("Program to calculate Commission Percentage");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Total Sale : ");
		double sale = scan.nextDouble();
		System.out.print("Enter Commission Rate : ");
		double rate = scan.nextDouble();
		double comm_amt = (sale * rate) / 100;
		double comm_perc = (comm_amt / sale) * 100;
		System.out.println("Commission Amount : " + comm_amt);
		System.out.println("Commission Percentage : " + comm_perc);
	}
	public static void main(String args[]){
		CommissionPercentage obj = new CommissionPercentage();
		obj.CalcCommission();
	}
}