import java.util.Arrays;
class CountOddEvenElementsArray{
	void countElements(){
		int[] arr = {10,15,20,25,30};
		int i, odd = 0, even = 0;
		for(i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Elements of array : " + Arrays.toString(arr));
		System.out.println("Total Odd Elements in array : " + odd + "\nTotal Even Elements in array : " + even);
	}
	public static void main(String args[]){
		CountOddEvenElementsArray obj = new CountOddEvenElementsArray();
		obj.countElements();
	}
}