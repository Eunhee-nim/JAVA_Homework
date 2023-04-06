package _0404_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {
//List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
//intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		//intList생성
		Random rand = new Random(); //foawja 
		
		//IntStream.range(0, 생성하고자 하는 갯수)
		IntStream.range(0, 10).forEach(i -> 
					intList.add(rand.nextInt(10)+1));
		
		System.out.println(intList);
		
		List<Integer>mulintList = intList.stream() //intList를 스트림으로 변환
				.map(n->n*3) //각 요소에 3배
				.collect(Collectors.toList()); //collect :스트림의 요소를 수집
		//Collectors : 스트림의 요소를 하나의 결과로 리듀스, 리스트, 맵 변환, (toList(), toSet(), toMap(), joining(), groupingBy() 등이 있음)
		//toList
		System.out.println(mulintList);
	}

}
