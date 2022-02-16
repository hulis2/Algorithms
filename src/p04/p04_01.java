package p04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 4단계 while문 문제 - 두 정수 A와 B를 입력받은 다음 A+B를 출력, 0 0 이 입력되면 종료
작성자 : 박철홍
작성일 : 2022.02.16
*/
public class p04_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				
				break;
				
			}
			
			bw.write((a+b)+"\n");
		}
		
		br.close();
		bw.close();
		
	}

}
