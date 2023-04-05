package day0403c;

import java.util.HashMap;
import java.util.Map;

public class Collection1 {
//    음식 이름을 키로 가지고 단품 가격을 값으로 가지는 foodPriceMap과 음식 이름을 키로 가지고 주문수량을 값으로 가지는 foodOrderMap을 선언하세요.
//	  음식과 가격은 비빔밥 : 6000, 칼국수 : 9000, 투뿔등심 : 70000이고 
//	  주문수량은 비빔밥 : 5, 칼국수 : 2, 투뿔등심 : 1 일 때 총가격을 계산해서 출력하세요.
//	  (Map을 이용해서 계산)
	
	public static void main (String [] args) {
	Map<String,Integer> foodPriceMap = new HashMap<>(); //foodPriceMap 생성
	
	Map<String,Integer> foodOrderMap = new HashMap<>(); //foodOrderMap 생성
	
	Integer bibim = foodPriceMap.put("비빔밥", 6000);
	Integer gooksoo = foodPriceMap.put("칼국수", 9000);
	Integer gogi = foodPriceMap.put("투쁠등심", 70000);
	// Value 지정
	Integer bibimo = foodOrderMap.put("비빔밥", 5 );
	Integer gooksooo = foodOrderMap.put("칼국수", 2 );
	Integer gogio = foodOrderMap.put("투쁠등심", 1 );
	// Value 지정
	
	int totalPrice = foodPriceMap.entrySet().stream() //foodPriceMap을 스트림으로 만듦
	        .mapToInt(entry -> entry.getValue() * //가격*주문 값을 Int로 변환
	        		foodOrderMap.getOrDefault(entry.getKey(), 0))//nullException에 대한 예외를 방지하기 위해 getOrDefault사용
	        			.sum(); //더하기
	
	System.out.println(totalPrice);
	}
}
