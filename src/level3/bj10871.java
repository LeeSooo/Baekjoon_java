package level3;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
// 배열을 이용하지 않는 방법이다.
// 즉, 입력받음과 동시에 if 문으로 검사해서 주어진 수 보다 작은 경우 StringBuilder에 저장해주는 방법이다.
// 이렇게 하면 배열을 굳이 생성 할 필요도 없고, for문도 한 번만 쓰면 되기 때문에 더욱 간단한 코드가 된다.
// => 코드 간결화, 시간 단축

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
 
		StringBuilder sb = new StringBuilder();
 
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
 
			if (value < X)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}