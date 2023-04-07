package _0406_homework;

import java.util.*;
import java.util.stream.Stream;

public class _0406_stream4 {
//2번에서 만든 List를 스트림으로 변환하고 
//성이 두자 이상인 인물의 정보를 스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)
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
		
		
		
		System.out.println("-- 성이 두 자 이상인 역사적 인물 --");
		
		hp.stream().filter(name ->  //이름의 길이가 3이상인 스트림을 필터로 거르기
					name.getName()
						.length()>3)
						.forEach(System.out::println);//출력
		
		
		
		
		
	}

}
