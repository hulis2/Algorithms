package p01;

import java.util.Scanner;

/*
���� 1�ܰ� ����� �� ��Ģ���� ���� - ���� ������ �Է� �ް� ������ ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.09
*/
public class P01_12_Remainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		sc.close();
		
	}

}
