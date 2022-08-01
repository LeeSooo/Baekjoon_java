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
        // 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
        int c = Integer.parseInt(br.readLine());
        
        // 둘째 줄부터 각 테스트 케이스마다 학생의 수(n)와 학생들의 점수가 주어진다.
        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());	// 학생의 수
            int arr[] = new int[n];						// 각 테스트 케이스의 학생 점수
            int sum = 0;								// 학생들의 평균을 계산할 합계
            
            // 학생들의 점수를 저장하고, 합계를 계산하는 for문
            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            
            // 학생들의 평균을 계산하기 위한 for문
            double mean = (sum / n) ;		// 평균 점수
			double count = 0; 				// 평균 넘는 학생 수
            
			// 평균을 넘는 학생들의 비율 찾는 for문
			for(int j = 0 ; j < n ; j++) {
				if(arr[j] > mean)
					count++;
			}
			
			// 소수점 셋째자리 출력 시 printf() 사용
			// - %.3f : 소수점 셋째자리
			// - %% : % 문자를 출력 시 사용
			System.out.printf("%.3f%%\n",(count/n)*100);
		}
	}
}