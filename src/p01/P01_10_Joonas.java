package p01;

import java.util.Scanner;

/*
백준 1단계 입출력 과 사칙연산 문제 - ID를 입력 받고 입력한 ID가 joonas인 경우 이미 가입된 ID로 ID뒤에??!을 붙여 출력
작성자 : 박철홍
작성일 : 2022.02.08
*/
public class P01_10_Joonas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		
		if(id.equals("joonas")) {
			System.out.println(id+"??!");
		}
		
		sc.close();
		
	}

}
