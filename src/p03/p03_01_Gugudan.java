package p03;

import java.util.Scanner;

/*
���� 3�ܰ� for�� ���� - �Է¹��� ���� N�� ������ N���� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.11
*/
public class p03_01_Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}

		sc.close();
		
	}

}
