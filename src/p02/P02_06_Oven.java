package p02;

import java.util.Scanner;

/*
���� 2�ܰ� if�� ���� - �� ��(ù��° �ð�, �ι�° ��)�� �Է¹ް� ����° ��(��)�� �Է¹޾� ���� �� ���� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.14
*/
public class P02_06_Oven {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int plusMin = sc.nextInt();
		
		int sumMin = min + plusMin;
		
		if(sumMin >= 60) {
			
			int sumHour = hour + sumMin/60;
			
			if(sumHour >= 24) {
				System.out.println((sumHour%24)+" "+(sumMin%60));
			}else {
				System.out.println(sumHour+" "+(sumMin%60));
			}
		}else {
			
			if(hour == 24) {
				System.out.println(0+ " "+sumMin);
			}else {
				System.out.println(hour+" "+sumMin);
			}
		}
		
		sc.close();
		
	}

}
