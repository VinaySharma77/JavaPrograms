import java.util.Scanner;
class WeekDay{
	void ShowDay(){
		System.out.println("Program to Print Day of Choice");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Day number (1-7) :");
		int num = scan.nextInt();
		switch(num){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Wrong input");
		}
	}
	public static void main(String args[]){
		WeekDay obj = new WeekDay();
		obj.ShowDay();
	}
}