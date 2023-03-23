package _230322_;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		String str1 = sc.next();
		
		int len = str1.length();
		
		if (len%2==0) { //길이가 짝수일 때
			int mid = len/2;
//			System.out.print(str1.substring(mid));
			System.out.print(str1.substring(mid-1,mid+1));
		} else { //짝수 외
			int mid = len/2;
			System.out.print(str1.charAt(mid));
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		//2번 문제
		
		String str2 = sc.next();
		
		int Cnt1 = 0;
		int Cnt2 = 0;
		
		for (int i= 0; i < str2.length();i++) {
			if (str2.charAt(i)=='가') {
				Cnt1++;
			} else if (str2.charAt(i)=='바'){
			Cnt2++;
			}
		}	
		if (Cnt1+Cnt2==0) {
		System.out.println("가, 바가 존재하지 않습니다.");	
		} else {
			System.out.println(Cnt1+Cnt2);
		}
		//3번 문제
		System.out.println();
		System.out.println("--------------------------");
		
		String str3 = sc.next();
		
		String [] strArr = {"a", "e", "i", "o", "u",
				"A", "E","I","O","U"};
		
		for (String A : strArr) {
			str3 = str3.replaceAll(A, "");
		}
		System.out.println(str3);
		
		System.out.println();
		System.out.println("--------------------------");
		
		String user1 = sc.nextLine();
		String user2 = sc.nextLine();
		
		if (user1.contains(user2)) {
			System.out.println("포함합니다.");
		} else {
			System.out.println("포함하지 않습니다.");
		}
	
		
	}
	
}
	
	


