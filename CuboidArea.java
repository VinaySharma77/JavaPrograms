import java.util.Scanner;
class CuboidArea{
	void CalcArea(){
		double length, width, height, area;
		System.out.println("Program to calculate Area of Cuboid");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length value : ");
		length = scan.nextDouble();
		System.out.print("Enter width value : ");
		width = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		area = 2 * ((length * width) + (length * height) + (height * width));
		System.out.println("Area of Cuboid is : " + area);
	}
	public static void main(String args[]){
		CuboidArea obj = new CuboidArea();
		obj.CalcArea();
	}
}