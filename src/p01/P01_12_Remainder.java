package p01;

import java.util.Scanner;

/*
백준 1단계 입출력 과 사칙연산 문제 - 숫자 세개를 입력 받고 나머지 계산
작성자 : 박철홍
작성일 : 2022.02.09
*/
public class P01_12_Remainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		sc.close();
		
	}

}
