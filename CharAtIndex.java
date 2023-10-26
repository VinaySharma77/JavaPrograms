import java.util.Scanner;
class CharAtIndex{
	public static void main(String args[]){
		System.out.println("Program to print character specified at specific index from string");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String text = scan.nextLine();
		System.out.print("Enter the Index : ");
		int index = scan.nextInt();
		if(index >= 0 && index < text.length()){
			char CharacterAtIndex = text.charAt(index);
			System.out.println("Character at Index : " + index + " is " + CharacterAtIndex);
		}
		else{
			System.out.println("Invalid Index !!");
		}
	}
}