package level3;

// 구구단
// 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
// BufferedReader + StringBuilder 사용

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj2739 {
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());	
		br.close();
		
		StringBuilder sb = new StringBuilder();
        
		for(int i = 1; i<10;i++) {
			sb.append(a).append(' ').append('*').append(' ').append(i);
			sb.append(' ').append('=').append(' ').append(a*i).append('\n');
		}
		
		// 테스트 해본 결과 sb.append(a+" * "+i+" = "+a*i+"\n"); 으로 한번에 넣어주는 것보다 
		// 위와 같이 문자를 하나씩 append 해주는 것이 속도가 조금 더 빠른 것으로 나온다. 
		// 이유는 잘 모르겠다...
		
		System.out.print(sb);
	}
}
