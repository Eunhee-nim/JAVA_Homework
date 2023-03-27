package _230324_homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle2 {
//길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
// 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String ud = sc.nextLine();
		//입력 받을 날짜
		
		SimpleDateFormat sd = new SimpleDateFormat ("yyyy-MM-dd");
		Date date = (sd.parse(ud));
		//날짜 형식 지정
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		//요일 배열 만들기
		String [] week = {"","일요일", "월요일", "화요일" , "수요일", 
				"목요일", "금요일" , "토요일" };
		String dayow = week[dow];
	
		System.out.println("요일은 : " + dayow);
			
		}

	}


