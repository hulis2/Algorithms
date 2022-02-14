package p02;

import java.util.Scanner;

/*
백준 2단계 if문 문제 - 세 수를 입력 받고 같은 수 조건에 따라 다르게 출력
작성자 : 박철홍
작성일 : 2022.02.14
*/
public class P02_07_Divice {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c && a == c) {
			
			System.out.println(10000+(a*1000));
		
		}else if(a == b || a == c) {
			
			System.out.println(1000+(a*100));
		
		}else if(b == c) {
			
			System.out.println(1000+(b*100));
		
		}else {
			
			System.out.println((Math.max(a, Math.max(b, c))*100));
		
		}
				
		sc.close();
		
	}

}
