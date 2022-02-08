package p01;

import java.util.Scanner;

/*
백준 1단계 입출력 과 사칙연산 문제 - 두수를 입력 받아 사칙연산 하기
작성자 : 박철홍
작성일 : 2022.02.08
*/
public class P01_09_ArithmeticOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();

	}

}
