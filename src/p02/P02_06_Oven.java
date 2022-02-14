package p02;

import java.util.Scanner;

/*
백준 2단계 if문 문제 - 두 수(첫번째 시간, 두번째 분)를 입력받고 세번째 수(분)을 입력받아 더한 시 분을 출력
작성자 : 박철홍
작성일 : 2022.02.14
*/
public class P02_06_Oven {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int plusMin = sc.nextInt();
		
		int sumMin = min + plusMin;
		
		if(sumMin >= 60) {
			
			int sumHour = hour + sumMin/60;
			
			if(sumHour >= 24) {
				System.out.println((sumHour%24)+" "+(sumMin%60));
			}else {
				System.out.println(sumHour+" "+(sumMin%60));
			}
		}else {
			
			if(hour == 24) {
				System.out.println(0+ " "+sumMin);
			}else {
				System.out.println(hour+" "+sumMin);
			}
		}
		
		sc.close();
		
	}

}
