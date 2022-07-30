package level4;

// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

/* - 메모리 낭비를 최소화 하는 방법
 * (1) 배열을 사용하지 않는다.
 * (2) 입력받은 문자를 즉시 비교한다. (시간복잡도가 N으로 정렬할 필요없어 시간단축 가능!)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			int val = Integer.parseInt(br.readLine());
			if (val > max) {
				max = val;
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);
	}
}
