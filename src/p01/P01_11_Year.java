package p01;

import java.util.Scanner;

/*
백준 1단계 입출력 과 사칙연산 문제 - 불기 년도를 입력 받아 서기 년도로 출력
작성자 : 박철홍
작성일 : 2022.02.09
*/
public class P01_11_Year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int bulYear = sc.nextInt();
		
		//입력된 불가연도에 불가연도와 서기연도의 차인 543을 빼서 서기연도를 구함
		int year = bulYear - 543;
		
		System.out.println(year);
		
		sc.close();
		
	}

}
