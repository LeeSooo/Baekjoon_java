package level6;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj11720 {
	public static void main(String[] args) throws IOException {		
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		// readLine() 으로 읽어들인 문자를 byte[]로 변환하여 반환되므로 
		// for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// 또는 (a-48)
		}
		
		System.out.print(sum);
		
	}
}
