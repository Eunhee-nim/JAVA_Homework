package _0404_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream5 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(); //String List 생성
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("문자열을 10번 입력하세요."); 
			strList.add(sc.next());
		} //사용자 문자열 입력
		
		 List<String> filteredStrList = strList.stream() //strList 스트림화
	                .filter(s -> s.matches(".*[a-zA-Z]+.*")) //a-z,A-Z가 포함되는 것들 필터
	                .collect(Collectors.toList());//리스트로 변환

	        filteredStrList.forEach(System.out::println); //출력
		
		
	}

}
