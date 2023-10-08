import java.util.Scanner;
class ConeVolume{
	void CalcVol(){
		double radius, height, volume;
		System.out.println("Program to calculate Volume of Cone");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius value : ");
		radius = scan.nextDouble();
		System.out.print("Enter height value : ");
		height = scan.nextDouble();
		volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
		System.out.print("Volume of Cone is : " + volume);
	}
	public static void main(String args[]){
		ConeVolume obj = new ConeVolume();
		obj.CalcVol();
	}
}