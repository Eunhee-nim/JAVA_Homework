package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		int []arr = new int [10];
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하세요.");
		
		
		for (int i = 0; i< arr.length ; i++) {
			arr [i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[9]);
		
	}

}
