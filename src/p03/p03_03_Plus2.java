package p03;

import java.util.Scanner;

/*
���� 3�ܰ� for�� ���� - ���� n�� �Է� �޾� 1 ���� n ������ ���� ���ؼ� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.11
*/
public class p03_03_Plus2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = n; i > 0; i--) {
			
			sum += i;
						
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
