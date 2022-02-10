package p02;

import java.util.Scanner;

/*
백준 2단계 if문 문제 - 두 수를 입력받아 몇 사분면에 위치하는지 출력
작성자 : 박철홍
작성일 : 2022.02.10
*/
public class P02_04_Quadrant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b = sc.nextInt();
				
		if(a>0 && b>0) {
			System.out.println("1");
		}else if(a<0 && b>0) {
			System.out.println("2");
		}else if(a<0 && b<0) {
			System.out.println("3");
		}else if(a>0 && b<0) {
			System.out.println("4");
		}
		
		sc.close();
		
	}

}
