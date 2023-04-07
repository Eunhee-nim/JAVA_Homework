package _0406_homework;

import java.util.*;


public class _0406_stream1 {
//사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 
//문자열의 길이가 5이상인 문자열만 출력하세요.
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>(); //List생성
		Scanner sc = new Scanner (System.in); //스캐너 생성
		
		for (int i = 0 ; i < 10 ; i++) { //10번 반복
			System.out.println("문자열을 입력하세요(10번)");
			str.add(sc.next()); //문자열 입력 
		}
		
		str.stream(). //list 스트림화
			filter(s-> s.length()>=5) // 문자열의 길이가 5이상인 것 거르기
			.forEach(System.out :: println); //출력
		
		// forEach(System.out :: println) = (s-> System.out.println(s))와 동일
		
	}

}
