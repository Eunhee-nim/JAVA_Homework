package _0404_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stream4 {

	//사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
    //영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>(); //charList 생성
		Scanner sc = new Scanner (System.in); //스캐너 생성
		
		System.out.println("영문자 10개를 입력하세요.");
		
		
		for (int i = 0; i < 10 ; i++) {
			char a = sc.next().charAt(0);
			charList.add(a);
		} //charList에 사용자가 입력한 문자 넣기
		
		
		Stream<Character> revStream = charList.stream() //charList스트림화
				.map(c -> Character.isUpperCase(c)? Character.toLowerCase(c): Character.toUpperCase(c) );
				//rev스트림에 map메소드 사용하여 넣기 -> 삼항 연산자로 UpperCase > 대문자라면 소문자로 변경 아니라면 대문자로 변경
		revStream.forEach(System.out :: print); //revStream 출력 
	}
		
		

}
