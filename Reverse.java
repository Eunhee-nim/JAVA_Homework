package _230322_;

public class Reverse {
	//Reverse클래스를 만들고 String reverseString(String str)
	//메서드를 만들어 문자열을 거꾸로 해라
	public String reverseString(String str) {
		StringBuilder reverse = new StringBuilder();
		//변경된 문자열을 받을 StringBuilder
		for (int i=str.length()-1 ; i >= 0 ; i-- ) {
			reverse.append(str.charAt(i));
		} //거꾸로 읽으면서 문자열을 동적으로 생성할 수 있게
		return reverse.toString();
		//반환 값
	}
		
	public static void main(String[] args) {
		Reverse r = new Reverse();
		String origin = "도킨치다싶고먹이볶떡";
		String reverse = r.reverseString(origin);
		System.out.println(reverse);

	}

}
