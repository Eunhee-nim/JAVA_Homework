package javada;

import java.util.*;

public class While7 {
	//키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	boolean run = true; //while 반복문 실행하기 위한 true값 설정
	int money = 0; //예금, 출금, 잔고 조회 시 변수값 설정
	
	while (run) {
		System.out.println("------------------------------");
		System.out.println("  1.예금 | 2.출금 | 3.잔고 | 4. 종료 ");
		System.out.println("------------------------------");
		//기본 메뉴 출력
		System.out.print("선택 >");
		
		int user = sc.nextInt();
		//메뉴 입력값 설정
		switch (user) {
		
			case 1: 
				System.out.print("예금액 >");
				money += sc.nextInt(); //money 라는 변수에 예금액 저장
				//입력하는 대로 + 될 수 있도록 함
				break;
			case 2:
				System.out.print("출금액 > ");
				money -= sc.nextInt();
				//출금액 저장
				//출금이므로 - 저장 될 수 있게끔
				break;
			case 3:
				System.out.print("잔고 > " + money);
				System.out.println();
				//잔고 확인
				break;
			case 4: 
				run= false;
				//반복문 종료
				break;
		}	
		
		System.out.println("프로그램 종료");
	}
	
	}

	
}
