package level1;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
/*
 * 성능 차이
 * BufferedReader+split()_(76ms) = BufferedReader+StringTokenizer_(76ms) >>>> Scanner_(112ms)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class bj1000 {
	public static void main(String[] args) throws IOException {
		/*
		  * 방법 1. (System 클래스 - 표준 입출력)
		 * Scanner in = new Scanner(System.in);		
		 * int A = in.nextInt();		
		 * int B = in.nextInt();		
		 * System.out.println(A+B);		
		 * in.close();
		 */
		
		// 방법2. BuffferedReader 를 이용하는 방법
		// * 문자열을 분리하는 방법
		// - StringTokenizer
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 		String str = br.readLine();
				StringTokenizer st = new StringTokenizer(str," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println(a+b);
		
		/* - split()
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		
		 * String[] str = br.readLine().split(" ");
		 * int a = Integer.parseInt(str[0]);
		 * int b = Integer.parseInt(str[1]);		
		 * System.out.println(a+b);
		 */
	}
}