package p03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
���� 3�ܰ� for�� ���� - ���� N�� �Է� ���� �� 1���� N���� ���پ� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.15
*/
public class p03_04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1;i <= n;i++) {
			bw.write(i + "\n");
		}
		
		br.close();
		bw.close();
		
	}

}
