package p03;

import java.util.Scanner;

/*
백준 3단계 for문 문제 - 두 정수를 입력 받아 더해서 출력하는 것을 주어진 숫자만큼 반복
작성자 : 박철홍
작성일 : 2022.02.11
*/
public class p03_02_Plus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
		}
		
		sc.close();
		
	}

}
