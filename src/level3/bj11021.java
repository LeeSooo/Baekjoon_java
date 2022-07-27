package level3;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj11021 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
		}
		System.out.println(sb);
	}
}
 