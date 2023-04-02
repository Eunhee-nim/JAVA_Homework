package homework2;

import java.util.*;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String [] str = new String [5];
		
		for (int i = 0 ; i < str.length ; i++ ) {
			System.out.println("문자열을 다섯 번 입력하세요.");
			str [i] = sc.next();
		}
		
		String longest = str[0];
		String shortest = str[0];
		
		for (int i = 1; i < str.length ; i++) {
			if (str[i].length() > longest.length()){
				longest = str[i];
			}
			if (str [i].length() < shortest.length()) {
				shortest = str[i];
			}
			System.out.println();
		}
		

	}

}
