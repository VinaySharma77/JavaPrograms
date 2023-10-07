import java.util.Scanner;
import java.util.Date;

class SecondsToTime{
	void TakeSeconds(){
		int num, hours, minutes, seconds;
		System.out.println("Program to convert seconds to hours, minutes, seconds");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of seconds : ");
		num = scan.nextInt();
		hours = num/3600;
		minutes = (num - (3600 * hours)) / 60;
		seconds = (num - (3600 * hours) - (minutes * 60));
		System.out.println("Hours : " + hours + "\nMinutes : " + minutes + "\nSeconds : " + seconds);
	}
	public static void main(String args[]){
		SecondsToTime obj = new SecondsToTime();
		obj.TakeSeconds();
	}
}