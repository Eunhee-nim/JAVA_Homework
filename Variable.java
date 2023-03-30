package homework;

import java.util.*;

public class Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);//스캐너 입력
		System.out.println("이름, 나이, 성별을 입력해주세요.");
		System.out.print(sc.nextLine());//출력
		
		System.out.println();
		
		//사용자가 입력한 두 개의 정수와 문자 연산자를 받아 
		//두 정수로 해당 연산을 수행한 결과를 출력하세요.
		System.out.println("숫자와 문자 연산자를 입력하세요.");
		
		int num1 = sc.nextInt(); //정수1
		int num2 = sc.nextInt(); //정수2
		char operator = sc.next().charAt(0); //문자연산자 입력 (String이어서 char값으로 변환)
		
		
		switch (operator) { //switch-case로 문자연산자를 입력했을 때 해당 결과가 나올 수 있게 함
		case '+' :
			System.out.println(num1 + num2);
			break;
		case '-' :
			System.out.println(num1 - num2);
			break;
		case '*' :
			System.out.println(num1 * num2);
			break;
		case '/' :
			System.out.println(num1/num2);
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
		
		}
		
		//반지름이 20인 원의 넓이와 둘레를 출력하세요.
		final double pie = 3.14;
		int circle = 20;
		System.out.println("반지름이 20인 원의 넓이는 " + 2*pie*(circle^2));
		System.out.println("반지름이 20인 원의 둘레는 " + 4*pie*circle);
		
		//사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		System.out.println("정수 5개를 입력하세요.");
		
		int nu1 = sc.nextInt();
		int nu2 = sc.nextInt();
		int nu3 = sc.nextInt();
		int nu4 = sc.nextInt();
		int nu5 = sc.nextInt();

		int sum = nu1+nu2+nu3+nu4+nu5;
		double avg = sum/5;
		
		System.out.println("정수 다섯 개의 합은 : " + sum + "입니다.");
		System.out.println("정수 다섯 개의 평균은 : " + avg + "입니다.");
		
		//사용자가 입력한 세 정수의 최소값, 중간값 최대값을 출력하세요.
		System.out.println("정수 3개를 입력하세요.");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int max;
		int min;
		int mid;
		
		if (n1<n2) {
			if (n1<n3) {
				min = n1;
			 if (n2<n3) {
				max = n3;
				mid = n2;
				} else {
				max = n2;
				mid = n3;
				}
			}
		}
		if (n2<n3) {
			if (n2<n1) {
				min = n2;
				if (n1<n3) {
					max = n3;
					mid = n1;
				} else {
					max = n1;
					mid = n3;
				}
			}
		}
		if (n3<n1) {
			if (n3<n2) {
				min = n3;
				if(n2<n1) {
					max = n1;
					mid = n2;
				} else {
					max = n2;
					mid = n1;
				}
			}
		}
		
		//사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
		// 2 * 2 = 4
		//  .....
		//  2 * 9 =
		System.out.println("정수를 입력하세요.");
		int numb = sc.nextInt();
		
		System.out.println(numb + " * 1 = " + numb * 1);
		System.out.println(numb + " * 2 = " + numb * 2);
		System.out.println(numb + " * 3 = " + numb * 3);
		System.out.println(numb + " * 4 = " + numb * 4);
		System.out.println(numb + " * 5 = " + numb * 5);
		System.out.println(numb + " * 6 = " + numb * 6);
		System.out.println(numb + " * 7 = " + numb * 7);
		System.out.println(numb + " * 8 = " + numb * 8);
		System.out.println(numb + " * 9 = " + numb * 9);
		
		//사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.
		
		System.out.println("정수를 입력하세요.");
		
		int num = sc.nextInt();
		int result = 1;
			
		for (int i = 1 ; i<=num ; i++ ) {
			 result *= i;
			}
		 
		System.out.println(result);
				
				

	}

}
