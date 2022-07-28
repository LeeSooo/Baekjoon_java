package level3;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 (별 역삼각형)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj2439 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) 
				sb.append(' ');
			for (int k = 1; k <= i; k++) 
				sb.append('*');
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
