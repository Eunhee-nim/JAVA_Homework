package homework;

import java.util.Scanner;

public class Type {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자가 두 개의 정수를 입력하면 문자열로 받아서 
		//두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		System.out.println("두 개의 정수를 입력하세요.");
		String num = sc.next();
		String num1 = sc.next();
		
		System.out.println(Integer.parseInt(num)+Integer.parseInt(num1));
		
		System.out.println("두 개의 정수를 입력하세요");
		System.out.println("a :");
		int a = sc.nextInt();
		System.out.println("b :");
		int b = sc.nextInt();
		
		if (b>0) {
			double div = a/b;
			System.out.println(div);
		} else if (b == 0) {
			System.out.println("잘못 입력하셨습니다. b는 0 이상의 수를 입력해주세요.");
		}
		
		//사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요. (3~4)함께
		//사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
		System.out.println("실수를 입력하세요.");
		float c = sc.nextFloat();
		
		System.out.println("실수의 정수형은 " + (int)c);
		System.out.println("실수의 제곱은 " + String.valueOf(c*c));
		
		//5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
		int iNum = 10;
		long lNum = 20;
		
		int x = iNum;
		iNum = (int)lNum;
		lNum = x;
		
		//6.사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		System.out.println("두 개의 문자를 입력하세요.");
		char d = sc.next().charAt(0);
		char e = sc.next().charAt(0);
		
		System.out.println((int)d + " , " + (int)e);
		
		
	}

}
