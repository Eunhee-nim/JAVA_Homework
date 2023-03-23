package _230322_;

import java.util.Scanner;
	//사용자에게 문자열을 입력 받아 중복된 문자를 제거하고 출력하시오.
public class Middle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //Scanner
		System.out.println("입력하세요.");
		
		String input = sc.next();
		//입력할 값
		StringBuilder remove = new StringBuilder();
		//변경된 문자열을 받을 StringBuilder
		for (char c : input.toCharArray()) {
			if (remove.indexOf(String.valueOf(c))==-1) {
				remove.append(c);//중복된 값 제거, 새로운 문자열 추가
			}
		}
		String output = remove.toString();
		// 출력
		
		//다른 방법
//		char [] chars = input.toCharArray();
//		
//		String remove = "";
//		for (char c : chars) {
//			if (remove.indexOf(c)==-1) {
//				remove += c;
//				}
//		}
		System.out.println("중복 제외 문자 : " + output);
		
		
		
		
	}

}
