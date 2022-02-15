package p03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 3단계 for문 문제 - 두 정수를 입력 받아 더한 후 수식까지 출력(처음 한번은 테스트 횟수 입력 받음)
작성자 : 박철홍
작성일 : 2022.02.15
*/
public class p03_06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1;i <= t;i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
			
		}
		
		br.close();
		bw.close();
		
	}

}
