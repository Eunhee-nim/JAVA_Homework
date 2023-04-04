package day0403v;

import java.util.Scanner;

public class Variable3 {
//3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 입력
		System.out.println("알파벳을 입력하세요.");
		
		String user = sc.nextLine();
		//받아줄 것
		StringBuilder output = new StringBuilder();
		//StringBuilder로 받기 
		//StringBuilder에 UpperCase와 LowerCase사용
		//But 전부 대문자, 전부 소문자로 변환하기 때문에 대문자 > 소문자
		//소문자 >> 대문자로 변환하려면 char형으로 받아야 함
		for (int i = 0; i < user.length(); i++) {
			char c = user.charAt(i); // user가 입력한 String 값을 char로 변환
			if(Character.isUpperCase(c)) { //문자가 대문자일 경우
				output.append(Character.toLowerCase(c)); //StringBuilder에 소문자로
			}else if (Character.isLowerCase(c)) { //입력한 문자가 소문자일 경우
				output.append(Character.toUpperCase(c));//StringBuilder에 대문자로
			}else {
				output.append(c); //아무것도 아닌 케이스 (대문자도 소문자도 아닌 것)
			}
		}
		System.out.println("대소문자 변환 : "+output);
		
		
	}

}
