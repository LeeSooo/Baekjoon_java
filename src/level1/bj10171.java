package level1;

// - 고양이를 출력한다.
// - 이스케이프 시퀀스 출력하기 (특수문자 사용 방법의 이해)
// 이 문제도 동일하게 4가지 방법으로 풀 수 있음.
/*
 \    /\
 )  ( ')
(  /  )
 \(__)|
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj10171 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("\\    /\\");
		bw.newLine();	// 줄 구분자
		
		bw.write(" )  ( ')");
		bw.newLine();	
        
		bw.write("(  /  )");
		bw.newLine();
        
		bw.write(" \\(__)|");
        
		bw.flush();
		bw.close();
	}
}