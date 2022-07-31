package level4;

// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());	//테스트 케이스
		String arr[] = new String[test_case];
 
		// OX 입력을 위한 for문
		for (int i = 0; i < test_case; i++) 
			arr[i] = br.readLine();
		
		// 점수 환산을 위한 for문
		for (int i = 0; i < test_case; i++) {
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') 
					cnt++;
				 else 
					cnt = 0;
				sum += cnt;
			}
			
			sb.append(sum).append('\n');
		}
		System.out.print(sb);
	}
}