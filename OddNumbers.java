class OddNumbers{
	public static void main(String args[]){
		System.out.println("Program to Print Odd Numbers between 1 to 20");
		int i;
		for(i = 1; i <=20; i++){
			if(i % 2 == 0){
				continue;
			}
			else{
				System.out.println("Odd Number is : " + i);
			}
		}
	}
}