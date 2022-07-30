package level2;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
// 삼항연산자를 사용 시 코드 간략화 => 간단한 조건문인 경우 가독성을 높일 수 있음(장점).
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj1330 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		System.out.println((A > B) ? ">" : ((A < B) ? "<" : "=="));

		/*
		 * 다른 방법 
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * String[] str = br.readLine().split(" "); 
		 * int A = Integer.parseInt(str[0]);
		 * int B = Integer.parseInt(str[1]);
		 * System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
		 */
	}
}
