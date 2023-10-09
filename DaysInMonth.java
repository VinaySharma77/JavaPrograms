import java.util.Scanner;
class DaysInMonth{
	void CalcDays(){
		System.out.println("Program to find days in a month");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a month number (1-12) : ");
		int month = scan.nextInt();
		System.out.print("Enter a year : ");
		int year = scan.nextInt();
		if(month < 1 || month > 12){
			System.out.println("Invalid Month Number");
		}
		else{
			java.time.YearMonth yearMonth = java.time.YearMonth.of(year, month);
			int days = yearMonth.lengthOfMonth();
			System.out.println("Number of days in specified month : " + days);
		}
	}
	public static void main(String args[]){
		DaysInMonth obj = new DaysInMonth();
		obj.CalcDays();
	}
}