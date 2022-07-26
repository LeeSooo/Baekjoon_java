package level2;
// 알람시계
/*
 * ※ 주의할 점
 * - 24시간 표현을 사용한다
 * - 입력은 공백 한 칸을 기준으로 구분되어 입력된다.
 * - 출력시 불필요한 0은 사용하지 않는다.
 */

/*
 * ※ 알고리즘 접근 방법
 * 1-1 단계 : 45분보다 작은지 여부 - if (min < 45 ) 
 * 2-1 단계 : 시(hour) 가 0보다 작은지 여부 - if (hour < 0 )
 * 1-2 단계 : 1단계 조건 외 여부 - else
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
