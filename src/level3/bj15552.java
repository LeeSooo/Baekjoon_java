package level3;

// 빠른 A+B (664ms)
// StringTokenizer을 생성하지 않으므로 시간과 용량 절약
// - 매 반복문마다 인스턴스를 생성해주고, 메서드 호출하는 방식이 시간지연의 원인이 될 수도 있음.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class bj15552 {
	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {		
			String str = br.readLine();		// 입력된 값 가져오기
			int target = str.indexOf(" ");	// 타겟 : 빈칸으로 정하기
			
			// 타겟을 기준으로 문자를 나눠서 계산하기
			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));		
			sb.append(result+"\n");
		}
		
		br.close();
		System.out.print(sb);
    }
}