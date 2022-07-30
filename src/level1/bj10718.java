package level1;

// 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
// Point : 개행문자(/n)

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
 
public class bj10718 {
	public static void main(String[] args) throws IOException {
		/* 
		 * 방법 1. (System 클래스 - 표준 입출력)
		 * System.out.println("강한친구 대한육군");
		 * System.out.println("강한친구 대한육군");    
		 */
		
		// 방법 2. BufferedWriter 를 이용하는 방법 *(중요)*
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("강한친구 대한육군");
		bw.newLine();	// '\n'과 같은 '역할'을 수행하지만, '\n'과 같은 것은 아님.  
		bw.write("강한친구 대한육군");
		bw.flush();
		bw.close();
		
		/* 
		 * 방법 3. StringBuilder 를 이용하는 방법
		 * StringBuilder sb = new StringBuilder();		
		 * sb.append("강한친구 대한육군\n");		
		 * sb.append("강한친구 대한육군");		
		 * System.out.println(sb);
		 */
		
		/*
		 * 방법 4. StringBuffer 를 이용하는 방법
		 * StringBuffer sb = new StringBuffer();
		 * sb.append("강한친구 대한육군\n");		
		 * sb.append("강한친구 대한육군");		
		 * System.out.println(sb);
		 */
	}
}