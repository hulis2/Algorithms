package p03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
���� 3�ܰ� for�� ���� - ������ �Է� �ް� 1 ~ N������ ���� ��ŭ �� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.15
*/
public class p03_07 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int n = Integer.parseInt(br.readLine());
		
		for(int k = 1;k <= n;k++) {
			
			for(int i = n;i > k;i--) {
				bw.write(" ");
			}
			
			for(int j = 0;j < k;j++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		br.close();
		bw.close();
		
	}

}
