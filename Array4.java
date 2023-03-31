package homework2;

public class Array4 {

	public static void main(String[] args) {
		int [] arr = new int [50];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = 2*(i+1);
		} 
		int sum = 0;
		for (int i = 0; i <arr.length ; i++ ) {
			sum += arr[i];
		}
		System.out.println("짝수의 합은 : " + sum);
	}
	
}
