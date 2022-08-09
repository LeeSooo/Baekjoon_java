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
		
		// getBytes() : String(문자열)에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드
		// - 이 때, 변환되는 방법은 Charset 에서 사용되는 인코딩 방식, 즉 UTF-16 인코딩으로 변경되는 값을 따른다.
		// - UTF-16 (유니코드)의 앞부분은 아스키코드와 호환되기 때문에 영어 문자 및 숫자는 같다.
		
		// readLine() 으로 읽어들인 문자를 byte[]로 변환하여 반환되므로 
		// for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// 또는 (a-48)
		}
		
		System.out.print(sum);
		
		/* // [스케너 사용 시]
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = in.nextInt();
		 * String a = sc.next();
		 * int sum = 0;
		 * 
		 * sc.close();
		 * 
		 * for(int i = 0; i < n; i++) {
		 * 	   sum += a.charAt(i)-'0';
		 * }
		 * System.out.print(sum);
		 */
		
	}
}
