package _0406_homework;

import java.util.*;
import java.util.stream.Stream;

public class _0406_stream2 {
//데이터를 갖는 List<HistoricPerson>를 만들어서 스트림으로 변환 후 
//사용자가 입력한 업적 하나만 갖는 스트림을 생성하고 출력하세요.
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
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("--업적을 입력하세요.--");
		
		String ach = sc.next();
		
		hp.stream().filter(a -> a.getAchievement() //스트림에서 업적 가져오기
						.equals(ach)). //사용자가 입력한 업적과 같은지
						forEach(System.out::println); //출력
		
		
		
	}

}
