package homework;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int min = a-b;
		int mul = a*b;
		int div = a/b;
		int rem = a%b;
		
		System.out.println("두 정수의 합 : " + sum);
		System.out.println("두 정수의 뺄셈 : " + min);
		System.out.println("두 정수의 곱 : " + mul);
		System.out.println("두 정수의 나누기 : " + div);
		System.out.println("두 정수의 나머지 : " + rem);
		
		int c = 20;
		
		System.out.print(++c + ",");
		System.out.print(++c + ",");
		System.out.print(c + ",");
		System.out.print(c-- + ",");
		System.out.print(--c + ",");
		System.out.print(c-- + ",");
		System.out.print(c++ );
		
		System.out.print(", 마지막 변수의 값 : " + c);

		//사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 
		//아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if (num % 2 == 0 && num % 7 == 0 ) { 
				System.out.println("2와 7의 공배수");
			} else {
				System.out.println("2와 7의 공배수가 아님");
			}
		
		//사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 
		//판별하는 프로그램을 작성하세요.
		System.out.println("문자열을 입력하세요.");
		String user = sc.nextLine();
		
		if (user.equals("Hello")) {
			System.out.println("입력한 값이 Hello와 동일합니다.");
		} else {
			System.out.println("입력한 값이 Hello와 같지 않습니다.");
		}
		
		//5. 삼항연산자를 이용하여 사용자가 입력한 정수가 
		//홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		System.out.println("정수를 입력하세요.");
		String usernum = (sc.nextInt()%2!=0)? "홀수" : "짝수" ;
		
		System.out.println(usernum);
		
		//6.삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 
		//작으면 "100보다 작음" 같으면 "100"을 출력하세요.
		System.out.println("정수를 입력하세요.");
		String userN = (sc.nextInt()<100) ? "100보다 작음" : 
			(sc.nextInt()>100) ? "100보다 큼" : "100";
		System.out.println(userN);
		//7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 
		//나머지 연산의 결과를 출력하세요.
		System.out.println("실수 두 개를 입력하세요.");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double sum1 = num3+num4;
		double min1 = num3-num4;
		double mul1 = num3*num4;
		double div1 = num3/num4;
		double rem1 = num3%num4;
		
		System.out.println("두 실수의 합 : " + sum1);
		System.out.println("두 실수의 뺄셈 : " + min1);
		System.out.println("두 실수의 곱 : " + mul1);
		System.out.println("두 실수의 나누기 : " + div1);
		System.out.println("두 실수의 나머지 : " + rem1);
		
		//8. 사용자가 입력한 하나의 문자열과 하나의 정수로 
		//"입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
		
		System.out.println("문자열과 정수를 입력하세요.");
		System.out.println("입력한 문자열 " + sc.nextLine() + "이고, " + 
						"입력한 숫자는 " + sc.nextInt() + "입니다.");
		
		
	}

}
