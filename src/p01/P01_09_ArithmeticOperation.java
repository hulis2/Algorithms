package p01;

import java.util.Scanner;

/*
���� 1�ܰ� ����� �� ��Ģ���� ���� - �μ��� �Է� �޾� ��Ģ���� �ϱ�
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.08
*/
public class P01_09_ArithmeticOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();

	}

}
