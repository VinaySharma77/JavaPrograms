import java.util.Scanner;
class PrismArea{
	void CalcArea(){
		double length, width, height, area;
		System.out.println("Program to calculate Area of Prism");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length value : ");
		length = scan.nextDouble();
		System.out.print("Enter width value : ");
		width = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		area = 2 * ((length * width) + (length * height) + (width * height));
		System.out.println("Area of Prism is : " + area);
	}
	public static void main(String args[]){
		PrismArea obj = new PrismArea();
		obj.CalcArea();
	}
}