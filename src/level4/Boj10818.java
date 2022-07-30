package level4;

// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

/* - 메모리 낭비를 최소화 하는 방법
 * (1) 배열을 사용하지 않는다.
 * (2) 입력받은 문자를 즉시 비교한다. (시간복잡도가 N으로 정렬할 필요없어 시간단축 가능!)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());	//첫 줄의 N은 사용하지 않기 때문에 입력만 받음.
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;	// 입력 값의 크기는 문제에서 정해줌.
		int min = 1000001;
		
		// hasMoreTokens() : 토큰의 존재 여부
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val>max) 
				max = val;
			if(val<min) 
				min = val;
		}
		
		System.out.println(min + " " + max);
	}
}