package level5;

// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
// ex) [ 1, 1, 1, 1, 1 ] , [ 1, 2, 3, 4, 5 ] , [ 1, 3, 5, 7 ,9 ] 등이 있다.
// 1 ~ 99 는 모두 등차 수열이다.
// 알고리즘을 작성할 때 100보다 작은 수와 100보다 큰 수의 케이스를 나누어 생각하면 된다.

// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}
 
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // 한수 카운팅
 
		// 1 ~ 99의 경우 그 수 자체가 수열이다. 
		// 만약, 86이라는 수를 입력받으면, 
		// 1 ~ 86까지는 모두 수열이기 때문에 86개의 수열이 존재한다.
		if (num < 100) 
			return num;
 
		else {
			cnt = 99;	// 1 ~ 99의 경우 그 수 자체가 수열이기 떄문 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; 			// 백의 자릿수
				int ten = (i / 10) % 10; 	// 십의 자릿수
				int one = i % 10;			// 일의 자릿수
 
				if ((hun - ten) == (ten - one)) {	// 각 자릿수가 수열을 이루면 카운팅하기!
					cnt++;
				}
			}
		}
		return cnt;
	}
}