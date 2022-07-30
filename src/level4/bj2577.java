package level4;

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10]; // 0~9까지 각 숫자의 개수를 저장하는 필드
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

		String str = String.valueOf(val);
 
		// 반드시 charAt()을 사용할 경우 : '0' 또는 -48 을 연산해야 한다. (But, 아스키코드에 대응하는 문자가 나옴.)
		for (int i = 0; i < str.length(); i++) 
			arr[(str.charAt(i) - '0')]++;
 
		for (int v : arr)
			System.out.println(v);
	}
}