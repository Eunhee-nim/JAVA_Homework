package _230314_homework;

public class _01_homeworkAdvanced {

	public static void main(String[] args) {
		
		String str = "dBEfIZ"; // 초기
		String capStr = ""; // 역순
		String res = ""; // 최종
		
		for(int i =0 ; str.length() -1 ; i >= 0;i--) {
			//capStr += str.charAt(i);
			System.out.println("역순 : " +capStr);
		}
		System.out.println("역순 : " +capStr);
		
		for (int i=0 ; i < str.length(); i++) {
			
			char ch = capStr.charAt(i);
//			char ch1 = (ch==90)? (char)97 : (char)((65<= ch && ch <= 90)? ch+33:ch-33);
//			res += ch1;
			ch =  (ch==90)? 97 : (char)((ch >= 65&& ch <= 90)? (ch+33)
					:(ch-33));   
			res+=ch;
		}
			System.out.println("결과 : " + res);
	}

}
