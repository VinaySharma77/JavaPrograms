class EvenNumbers{
	public static void main(String args[]){
		System.out.println("Program to Print Even Numbers between 1 to 20");
		int i;
		for(i = 1; i <=20; i++){
			if(i % 2 == 0){
				System.out.println("Even Number is : " + i);
			}
			else{
				continue;
			}
		}
	}
}