package _0406_homework;

import java.util.*;
import java.util.stream.Stream;

public class _0406_stream5 {
//HistoricPerson에 getSameCountryPerson(String country)를 만들고
//2번에서 만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 
//모은 스트림으로 만들어서 출력하세요. 
	public static void main(String[] args) {
		List<HistoricPerson> hp = new ArrayList<HistoricPerson>();
		
		hp.add(new HistoricPerson("이도", "한글", "조선"));
		hp.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hp.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hp.add(new HistoricPerson("장영실", "측우기", "조선"));
		hp.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hp.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hp.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hp.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hp.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hp.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		
		Scanner sc = new Scanner(System.in); //스캐너 생성
		
		System.out.println("-- 조회하고 싶은 인물들의 나라를 입력하세요. --");
		String InputCountry = sc.next();
		
		hp.stream().filter(country -> //hp스트림화, 필터 메소드 사용 
					country.getCountry() //스트림의 나라 얻어오기
					.equals(InputCountry ))//사용자가 입력한 나라와 비교
					.forEach(System.out :: println); //출력
		
		
		
		
		
	}

}
