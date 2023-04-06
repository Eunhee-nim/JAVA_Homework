package _0404_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
//int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
//List<Student> studentList에 
//(1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를 
//저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
	public static void main(String[] args) {
		List<Student>sL = new ArrayList <Student>();
		//ArrayList 생성
		sL.add(new Student(1, "홍길동", 100));
		sL.add(new Student(2, "임꺽정", 75));
		sL.add(new Student(3, "장길산", 86));
		sL.add(new Student(4, "정도전", 100));
		sL.add(new Student(5, "이순신", 95));
		
		sL.stream().filter(s -> s.getScore()>=95)//95점 이상의 학생 필터
				.forEach(s-> System.out.println(s.getsName()));
				//95점 이상의 학생들 이름만
	

//2번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
		
		sL.stream().filter(a->a.getScore()>=95).map(g->{
			g.setGrade("A+");
			return g;	//map메소드 이용하기 setGrade는 리턴 값이 필요하므로 return g;
		}).forEach(System.out :: println); //출력
		
	   
	}

}
