package p02;

import java.util.Scanner;

/*
���� 2�ܰ� if�� ���� - �μ��� �Է¹ް� ���Ͽ� ��� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.10
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
