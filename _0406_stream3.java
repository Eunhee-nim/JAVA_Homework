package _0406_homework;

import java.util.*;
import java.util.stream.Stream;

public class _0406_stream3 {
//2번에서 만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.
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
		
		Stream<HistoricPerson> hpLeeStream = 
				hp.stream() //이씨 성을 가진 stream생성
				.filter(name -> 
						name.getName()
						.startsWith("이")); //이로 시작하는 것 담기
		
		hpLeeStream.forEach(System.out::println); //이씨 성을 가진 스트림 출력
		
		
		
	}

}
