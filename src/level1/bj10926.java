package level1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 
// 준하는 놀람을 ??!로 표현한다. 
// 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
// 놀람을 표현하는 프로그램을 작성하시오.

// - Scanner와 BufferedReader 입력 속도를 비교해 보았을 때, BuffferedReader가 더 빠른 걸 볼 수 있다.

public class bj10926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lastString = "??!";
		
		String s = br.readLine();
		System.out.println(s + lastString);
	}
}