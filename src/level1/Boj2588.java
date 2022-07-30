package level1;

// 곱셈
// point - 입력값 분리 방법
/* (1) 문자열로 입력받아 charAt() 으로 하나씩 꺼내 쓰는 방법
 * (2) 나머지와 나눗셈 연산을 통해 각 자릿수를 구하여 쓰는 방법
 * (3) 문자열을 character 배열로 한 자리씩 넣어주어 이용하는 방법
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		br.close();

		StringBuilder sb = new StringBuilder();

		sb.append(A * (B % 10));
		sb.append('\n');

		sb.append(A * ((B % 100) / 10));
		sb.append('\n');

		sb.append(A * (B / 100));
		sb.append('\n');

		sb.append(A * B);

		System.out.print(sb);

		/*
		 * 1번 방법 
		 * Scanner in = new Scanner(System.in); 
		 * int A = in.nextInt(); 
		 * String B = in.next(); 
		 * in.close(); 
		 * System.out.println(A * (B.charAt(2) - '0'));
		 * System.out.println(A * (B.charAt(1) - '0')); 
		 * System.out.println(A * (B.charAt(0) - '0')); 
		 * System.out.println(A * Integer.parseInt(B));
		 */

		/*
		 * 2번 방법 Scanner in = new Scanner(System.in);
		 * int A = in.nextInt(); int B = in.nextInt();
		 * in.close();
		 * System.out.println(A*(B%10)); 
		 * System.out.println(A*(B%100/10));
		 * System.out.println(A*(B/100)); 
		 * System.out.println(A*B);
		 */

		/*
		 * 3번 방법 BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * int A = Integer.parseInt(br.readLine()); 
		 * String B = br.readLine();
		 * char[] b = B.toCharArray();
		 * System.out.println(A * (b[2]-'0')); 
		 * System.out.println(A * (b[1]-'0'));
		 * System.out.println(A * (b[0]-'0')); 
		 * System.out.println(A * Integer.parseInt(B));
		 */
	}
}