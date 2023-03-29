package _230327_homework;

import java.util.*;


public class Middle1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		
		map.put("홍길동", 85);
		map.put("김첨지", 43);
		map.put("김수연", 95);
		map.put("김철수", 88);
		
		int maxSC = Integer.MIN_VALUE;
		String topS = null;
		
		for (Map.Entry<String, Integer>entry : map.entrySet()) {
			if (entry.getValue()>maxSC) {
				maxSC = entry.getValue();
				topS = entry.getKey();
			}
		}
		System.out.println(maxSC + ":" + topS);
		
	}

}
