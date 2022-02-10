package p02;

import java.util.Scanner;

/*
백준 2단계 if문 문제 - 두수를 입력받고 비교하여 결과 출력
작성자 : 박철홍
작성일 : 2022.02.10
*/
public class P02_01_Compare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		sc.close();
		
	}

}
