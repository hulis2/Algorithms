package p03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 3단계 for문 문제 - 두 정수를 입력 받아 더해서 출력하는 것을 주어진 숫자만큼 반복을 입출력이 빠르게 BufferedReader와 BufferedWriter를 사용
작성자 : 박철홍
작성일 : 2022.02.11
*/
public class p03_04_FastPlus {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
			
		for (int i = 0; i < t; i++) {
			
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
