package p01;

import java.util.Scanner;

/*
백준 1단계 입출력 과 사칙연산 문제 - 세자리 수 두개를 입력 받고 곱셈 과정을 출력
작성자 : 박철홍
작성일 : 2022.02.09
*/
public class P01_13_Multiply {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//첫번째 입력 받은 숫자와 두번째 입력 받은 숫자의 곱셈의 과정을 출력하기 위한 재귀함수 호출
		recursion(a, b);
		
		//첫번째 입력 받은 숫자와 두번째 입력 받은 숫자의 곱셈의 결과
		System.out.println(a*b);
		
		sc.close();
		
	}
	
	//두번째 입력 받은 숫자를 하나하나 뽑아서 첫번째 입력 받은 숫자와 곱해서 출력하는 재귀함수
	public static void recursion(int a, int b) {
		if(b > 0) {
			System.out.println(a*(b%10));
			recursion(a, b/10);
		}
	}

}
