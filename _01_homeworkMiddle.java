package _230314_homework;

import java.util.Scanner;

public class _01_homeworkMiddle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int age = sc.nextInt();
		
		System.out.println(age<=29&&age>=20? "20대입니다." : "30대입니다.");

		/*
		 * int age1 = 29; if (age1<=29 && age1 >=20) System.out.println("20대"); else
		 * System.out.println();
		 */
	}

}
