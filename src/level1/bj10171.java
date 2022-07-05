package level1;

// 고양이를 출력한다.
// - 역슬래시 출력하기
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