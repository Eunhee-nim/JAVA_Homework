package _230324_homework;

public class Advance1 {
    //2001년 12월 19일이 결혼기념일인 부부가 있다. 
    //윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
    //2022년의 결혼기념일 날짜를 구하세요.
	public static void main(String[] args) {
		
		int lpCnt = 0;
		for (int year = 2001 ; year <= 2022; year++ ) {
			if((year%400==0||( year%100!=0 && year % 4==0))) {
				lpCnt++; // 윤년이 있는 해에 누적
			}
		} System.out.println("2022년 12월" + (19+lpCnt)+"일"); 
	}

}
