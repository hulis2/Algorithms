package p02;

import java.util.Scanner;

/*
백준 2단계 if문 문제 - 년도를 입력 받아 윤년인지 아닌지 출력
작성자 : 박철홍
작성일 : 2022.02.10
*/
public class P02_02_LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
				
		if(year%4 == 0 && year%100 != 0 || year%400 ==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		sc.close();
		
	}

}
