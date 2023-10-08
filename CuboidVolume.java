import java.util.Scanner;
class CuboidVolume{
	void CalcVol(){
		double length, width, height, volume;
		System.out.println("Program to calculate Volume of Cuboid");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length value : ");
		length = scan.nextDouble();
		System.out.print("Enter width value : ");
		width = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		volume = length * width * height;
		System.out.println("Volume of Cuboid is : " + volume);
	}
	public static void main(String args[]){
		CuboidVolume obj = new CuboidVolume();
		obj.CalcVol();
	}
}