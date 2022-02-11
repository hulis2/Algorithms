package p03;

import java.util.Scanner;

/*
백준 3단계 for문 문제 - 정수 n을 입력 받아 1 부터 n 까지의 합을 구해서 출력
작성자 : 박철홍
작성일 : 2022.02.11
*/
public class p03_03_Plus2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = n; i > 0; i--) {
			
			sum += i;
						
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
