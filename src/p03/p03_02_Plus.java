package p03;

import java.util.Scanner;

/*
���� 3�ܰ� for�� ���� - �� ������ �Է� �޾� ���ؼ� ����ϴ� ���� �־��� ���ڸ�ŭ �ݺ�
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.11
*/
public class p03_02_Plus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
		}
		
		sc.close();
		
	}

}
