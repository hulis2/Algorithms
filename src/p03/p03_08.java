package p03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
���� 3�ܰ� for�� ���� - ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶� A���� X���� ���� ���� ��� ���
�ۼ��� : ��öȫ
�ۼ��� : 2022.02.16
*/
public class p03_08 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0;i < n;i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(a > num) {
				bw.write(num+" ");
			}
		}
		
		br.close();
		bw.close();
		
	}

}
