package level3;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력이 한 자리 수이고, 공백의 위치는 고정이라는 점을 이용하여 풀 수 있다.
// charAt()의 경우 문자로 반환되기 때문에 반드시 -48 (또는 -'0') 을 해주어야 정수의 형태가 나온다.
// StringTokenizer을 계속 생성해줄 필요 없으니 성능 측면에서 좀 더 이점을 보일 수 있다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Boj10952 {
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = br.readLine();
			
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;
            
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
}