package p01;

import java.util.Scanner;

/*
���� 1�ܰ� ����� �� ��Ģ���� ���� - ID�� �Է� �ް� �Է��� ID�� joonas�� ��� �̹� ���Ե� ID�� ID�ڿ�??!�� �ٿ� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.08
*/
public class P01_10_Joonas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		
		if(id.equals("joonas")) {
			System.out.println(id+"??!");
		}
		
		sc.close();
		
	}

}
