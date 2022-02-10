package p02;

import java.util.Scanner;

/*
백준 2단계 if문 문제 - 시험 성적을 입력받아 등급별로 출력
작성자 : 박철홍
작성일 : 2022.02.10
*/
public class P02_03_LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int record = sc.nextInt();
				
		if(record <= 100 && record >= 90) {
			System.out.println("A");
		}else if(record >= 80) {
			System.out.println("B");
		}else if(record >= 70){
			System.out.println("C");
		}else if(record >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc.close();
		
	}

}
