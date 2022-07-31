package level4;

// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
// 문제 킹받네...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < testcase ; i++) {
			st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력
			
			int N = Integer.parseInt(st.nextToken());	//학생 수 
			arr = new int[N];
			
			double sum = 0;	// 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j = 0 ; j < N ; j++) {
				int val = Integer.parseInt(st.nextToken());	// 성적 저장
				arr[j] = val;
				sum += val;	// 성적 누적 합 
			}
			
			double mean = (sum / N) ;
			double count = 0; // 평균 넘는 학생 수 변수 
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean)
					count++;
			}
			
			// 소수점 셋째자리 출력 시 printf() 사용
			// - &.3f : 소수점 셋째자리
			// - %% : % 문자를 출력 시 사용
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}
}