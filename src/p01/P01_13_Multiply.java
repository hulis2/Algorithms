package p01;

import java.util.Scanner;

/*
���� 1�ܰ� ����� �� ��Ģ���� ���� - ���ڸ� �� �ΰ��� �Է� �ް� ���� ������ ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.09
*/
public class P01_13_Multiply {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//ù��° �Է� ���� ���ڿ� �ι�° �Է� ���� ������ ������ ������ ����ϱ� ���� ����Լ� ȣ��
		recursion(a, b);
		
		//ù��° �Է� ���� ���ڿ� �ι�° �Է� ���� ������ ������ ���
		System.out.println(a*b);
		
		sc.close();
		
	}
	
	//�ι�° �Է� ���� ���ڸ� �ϳ��ϳ� �̾Ƽ� ù��° �Է� ���� ���ڿ� ���ؼ� ����ϴ� ����Լ�
	public static void recursion(int a, int b) {
		if(b > 0) {
			System.out.println(a*(b%10));
			recursion(a, b/10);
		}
	}

}
