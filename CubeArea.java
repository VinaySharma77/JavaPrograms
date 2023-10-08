import java.util.Scanner;
class CubeArea{
	void CalcArea(){
		double side, area;
		System.out.println("Program to calculate Area of Cube");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter side value : ");
		side = scan.nextDouble();
		area = 6 * side * side;
		System.out.println("Area of Cube is : " + area);
	}
	public static void main(String args[]){
		CubeArea obj = new CubeArea();
		obj.CalcArea();
	}
}