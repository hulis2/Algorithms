package p02;

import java.util.Scanner;

/*
���� 2�ܰ� if�� ���� - �� ��(ù��° �ð�, �ι�° ��)�� �Է¹޾� 45�� �� �ð� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.10
*/
public class P02_05_Time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour= sc.nextInt();
		int minute = sc.nextInt();
				
		if(minute >= 45) {
			System.out.println(hour+" "+(minute-45));
		}else if (minute < 45 && minute >= 0){
			if(hour >= 1) {
				System.out.println((hour-1)+" "+(60+(minute-45)));
			}else if (hour == 0){
				System.out.println(23+" "+(60+(minute-45)));
			}
		}
		
		sc.close();
		
	}

}
