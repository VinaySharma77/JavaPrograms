import java.util.Scanner;
class CharacterCounter{
	void CountEverything(){
		String text;
		int countLetters = 0;
		int countSpaces = 0;
		int countNumbers = 0;
		int countCharacters = 0;
		System.out.println("Program to count letter, spaces, numbers, characters in text");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		text = scan.nextLine();
		for(char arr : text.toCharArray()){
			if(Character.isLetter(arr)){
				countLetters++;
			}
			else if(Character.isDigit(arr)){
				countNumbers++;
			}
			else if(Character.isWhitespace(arr)){
				countSpaces++;
			}
			else{
				countCharacters++;
			}
		}
		System.out.println("Total Letters : " + countLetters);
		System.out.println("Total Numbers : " + countNumbers);
		System.out.println("Total Spaces : " + countSpaces);
		System.out.println("Total Characters : " + countCharacters);
	}
	public static void main(String args[]){
		CharacterCounter obj = new CharacterCounter();
		obj.CountEverything();
	}
}