package name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. 김씨와 이씨는 각각 몇 명 인가요?
//2. "이재영"이란 이름이 몇 번 반복되나요?
//3. 중복을 제거한 이름을 출력하세요.
//4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

public class Name {
	public static void main (String [] args) {
		String [] name = {"이유덕","이재영","권종표","이재영",
							"박민호","강상희","이재영","김지완",
							"최승혁","이성연","박영서","박민호",
							"전경헌","송정환","김재성","이유덕","전경헌"};
		
		List<String> nameList = Arrays.stream(name).collect(Collectors.toList());
		//1. 김씨 인원 세기 (스트림, 필터, startWith, 카운트 사용)
		int kimCnt = (int) nameList.stream()	
									.filter(s-> 
											s.startsWith("김")) //김으로 시작하는 경우를 거름
											.count(); //count해주는 최종 연산
		
		System.out.println(kimCnt);
		
		//1. 이씨 인원 세기 (스트림, 필터, startWith, 카운트 사용)
		int leeCnt = (int) nameList.stream()
									.filter(l -> 
											l.startsWith("이"))
											.count(); 
		
		System.out.println("이 씨로 시작하는 사람들의 수" + leeCnt);
	
		int jaeCnt = (int) nameList.stream()
									.filter(j ->
											j.contains("이재영")) //인덱스 중 이재영이라는 이름이 포함되어 있으면 걸러짐
											.count();
		
		System.out.println("이재영 이름의 반복된 수" + jaeCnt);
									
		List<String> none = nameList.stream()
									.distinct() //스트림에서 중복을 제거해주는 메소드
									.collect(Collectors.toList()); //collect 메소드 활용하여 다시 리스트로 변환
		
		System.out.println("중복이 제거 된 이름 리스트");
		System.out.println();
		none.forEach(System.out::println); 
		
		System.out.println("오름차순으로 정리");
		System.out.println();
		none.stream().sorted()	//오름차순으로 정리해주는 sorted메소드 사용하기 
			.forEach(System.out::println);
	}
}


