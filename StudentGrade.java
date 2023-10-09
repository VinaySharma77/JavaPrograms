import java.util.Scanner;
class StudentGrade{
	void CalcGrade(){
		System.out.println("Program to calculate Student Grade");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student's Marks : ");
		int num = scan.nextInt();
		if(num >= 90){
			System.out.print("Student Grade is : A");
		}
		else if(num >=80){
			System.out.print("Student Grade is : B");
		}
		else if(num >=70){
			System.out.print("Student Grade is : C");
		}
		else if(num >=60){
			System.out.print("Student Grade is : D");
		}
		else if(num >=50){
			System.out.print("Student Grade is : E");
		}
		else{
			System.out.print("Student Grade is : F");
		}
	}
	public static void main(String args[]){
		StudentGrade obj = new StudentGrade();
		obj.CalcGrade();
	}
}