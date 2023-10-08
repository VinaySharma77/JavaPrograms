import java.util.Scanner;
class CircleArea{
	void CalcArea(){
		System.out.println("Program to calculate area of Circle");
		double radius, area;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius value : ");
		radius = scan.nextDouble();
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of Circle is : " + area);
	}
	public static void main(String args[]){
		CircleArea obj = new CircleArea();
		obj.CalcArea();
	}
}