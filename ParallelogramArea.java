import java.util.Scanner;
class ParallelogramArea{
	void CalcArea(){
		double base, height, area;
		System.out.println("Program to calculate Area of Parallelogram");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base value : ");
		base = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		area = base * height;
		System.out.println("Area of Parallelogram is : " + area);
	}
	public static void main(String args[]){
		ParallelogramArea obj = new ParallelogramArea();
		obj.CalcArea();
	}
}