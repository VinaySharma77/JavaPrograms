import java.util.Scanner;
class PointsDistance{
	void CalcDist(){
		System.out.println("Program to calculate Distance between two Points");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x-coordinate of first point : ");
		double x1 = scan.nextDouble();
		System.out.print("Enter y-coordinate of first point : ");
		double y1 = scan.nextDouble();
		System.out.print("Enter x-coordinate of second point : ");
		double x2 = scan.nextDouble();
		System.out.print("Enter y-coordinate of second point : ");
		double y2 = scan.nextDouble();
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.print("Distance between two points is : " + distance);
	}
	public static void main(String args[]){
		PointsDistance obj = new PointsDistance();
		obj.CalcDist();
	}
}