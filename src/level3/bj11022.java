package level3;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 출력 값 : Case #1: 1 + 1 = 2
// A 와 B 는 "무조건" 한 자릿수만 입력받기 때문에 
// 문자열로 입력 받을 시 공백이 들어가는 위치는 언제나 고정되어있음.
// 문자열의 특정 위치의 문자를 반환해주는 charAt()을 사용할 시 
// StringTokenizer 객체를 생성하지 않아도 되기 때문에 시간 단축!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj11022 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			int a = str.charAt(0)-'0';
			int b = str.charAt(2)-'0';
			sb.append("Case #").append(i).append(": ").append(a)
			.append(" + ").append(b).append(" = ").append(a+b).append('\n');
		}
		System.out.println(sb);
	}
}