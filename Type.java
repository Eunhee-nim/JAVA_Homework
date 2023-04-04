package day0403t;

import java.util.Scanner;

public class Type {
//사용자가 입력한 수(실수나 정수 모두 가능)를 StringBuilder로 받아서 
//점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수나 정수를 입력해주세요.");
		
		String input = sc.nextLine(); //String으로 입력 받음
		StringBuilder sb = new StringBuilder(input); //StringBuilder 생성
		double douVal = 0; //double 값 만들기
		int intVal =0; //int값 만들기
		String str = null;
		
		for (int i = 0; i < input.length() ; i++) {
			if (sb.indexOf(".")!=-1) { //indexOf는 
				douVal = Double.parseDouble(input);
				str = "double 형 변환" + douVal;
			} else {
				intVal = Integer.parseInt(input);
				str = "int 형 변환" + intVal;
				//str = for문 안에 실수나 정수가 들어갔을 때
				//조건에 맞는 것만 삽입되게 하는 String 값
			}
		}

		System.out.println(str); //str값만 출력
	}

}
