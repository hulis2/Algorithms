package p02;

import java.util.Scanner;

/*
���� 2�ܰ� if�� ���� - �⵵�� �Է� �޾� �������� �ƴ��� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.10
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
