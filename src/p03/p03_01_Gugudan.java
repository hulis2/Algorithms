package p03;

import java.util.Scanner;

/*
백준 3단계 for문 문제 - 입력받은 숫자 N의 구구단 N단을 출력
작성자 : 박철홍
작성일 : 2022.02.11
*/
public class p03_01_Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}

		sc.close();
		
	}

}
