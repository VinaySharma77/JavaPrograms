import java.util.Scanner;
class TriangleArea{
	void CalcArea(){
		double base, height, area;
		System.out.println("Program to calculate Area of Triangle");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base value : ");
		base = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		area = (base * height) / 2;
		System.out.println("Area of Triangle is : " + area);		
	}
	public static void main(String args[]){
		TriangleArea obj = new TriangleArea();
		obj.CalcArea();
	}
}