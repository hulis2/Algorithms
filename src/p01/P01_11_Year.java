package p01;

import java.util.Scanner;

/*
���� 1�ܰ� ����� �� ��Ģ���� ���� - �ұ� �⵵�� �Է� �޾� ���� �⵵�� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.09
*/
public class P01_11_Year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int bulYear = sc.nextInt();
		
		//�Էµ� �Ұ������� �Ұ������� ���⿬���� ���� 543�� ���� ���⿬���� ����
		int year = bulYear - 543;
		
		System.out.println(year);
		
		sc.close();
		
	}

}
