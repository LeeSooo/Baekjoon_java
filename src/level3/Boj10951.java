package level3;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// EOF 란?
// 즉 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것이다.
// 데이터가 더이상 존재하지 않을 때, EOF (End of File) - 파일의 끝이라 한다.

// StringTokenizer가 성능이 좋다고는 하지만 반복문을 할 때마다 객체를 계속 생성해주는게 시간낭비!
// -  charAt()은 해당 문자의 아스키코드 값을 반환하기 때문에 반드시 정수 형태로 변경하려면 -48 또는 -'0'을 해줘야 함.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj10951 {
public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
}