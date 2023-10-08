import java.util.Scanner;
class CylinderArea{
	void CalcArea(){
		double radius, height, area;
		System.out.println("Program to calculate Area of Cylinder");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius value : ");
		radius = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		area = 2 * Math.PI * radius * (radius + height);
		System.out.println("Area of Cylinder is : " + area);
	}
	public static void main(String args[]){
		CylinderArea obj = new CylinderArea();
		obj.CalcArea();
	}
}