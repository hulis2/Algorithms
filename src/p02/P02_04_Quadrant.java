package p02;

import java.util.Scanner;

/*
���� 2�ܰ� if�� ���� - �� ���� �Է¹޾� �� ��и鿡 ��ġ�ϴ��� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.10
*/
public class P02_04_Quadrant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b = sc.nextInt();
				
		if(a>0 && b>0) {
			System.out.println("1");
		}else if(a<0 && b>0) {
			System.out.println("2");
		}else if(a<0 && b<0) {
			System.out.println("3");
		}else if(a>0 && b<0) {
			System.out.println("4");
		}
		
		sc.close();
		
	}

}
