package loop;

import java.util.*;

public class Loop1 {
//1~20까지 랜덤한 값을 생성해서 생성한 랜덤 값만큼 반복되는 반복문을 만들고
//반복문에서 사용자가 입력한 문자열에 "bit"를 계속 추가하세요. 그리고 bit가 몇 번
//추가됐는지 개수를 세서 출력하세요. 랜던 값을 그대로 출력하면 안됩니다.
	public static void main(String[] args) {
		Random rand = new Random(); //랜덤 만들기
		Scanner sc = new Scanner (System.in); //Scanner
		System.out.println("문자열을 입력하세요.");
		
		int com = rand.nextInt(20)+1; //1~20까지의 랜덤
		String user = sc.nextLine(); //사용자에게 String값 받기
		int index = 0; // bit의 개수
		StringBuilder sb = new StringBuilder(user); //입력값 포함 StirngBuilder
		
		for (int i = 0 ; i <= com ; i++) {
			sb.append("bit"); //StringBuilder에 bit 붙임 
			index++; //bit개수 
		}
		System.out.println("랜덤값" +com);
		System.out.println("bit 추가 " + sb);
		System.out.println("bit 추가 개수" + index);
		//출력 
	}

}
