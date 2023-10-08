import java.util.Scanner;
class CylinderVolume{
	void CalcVol(){
		double radius, height, volume;
		System.out.println("Program to calculate Volume of Cylinder");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius value : ");
		radius = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		volume = Math.PI * Math.pow(radius, 2) * height;
		System.out.println("Volume of Cylinder is : " + volume);
	}
	public static void main(String args[]){
		CylinderVolume obj = new CylinderVolume();
		obj.CalcVol();
	}
}