import java.util.Scanner;
class CheckVowelConsonant{
	void CheckChar(){
		System.out.println("Program to check character is Vowel or Consonant");
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character : ");
		ch = scan.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println("Entered character is Vowel");
		}
		else{
			System.out.println("Entered character is Consonant");
		}
	}
	public static void main(String args[]){
		CheckVowelConsonant obj = new CheckVowelConsonant();
		obj.CheckChar();
	}
}