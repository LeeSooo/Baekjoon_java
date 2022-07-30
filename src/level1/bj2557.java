package level1;

//Hello World!를 출력하시오.

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj2557 {
	public static void main(String[] args) throws IOException {
		/* 
		 * 방법 1. (System 클래스 - 표준 입출력)
		 * System.out.println("Hello World!");
		 */
		
		// 방법 2. BufferedWriter 를 이용하는 방법 *(중요)*
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!");
		bw.flush();
		bw.close();
		/* 
		 * BufferedWriter / BufferedReader는 Buffer에 있는 IO 클래스인데 
		 * 이 클래스들은 데이터를 하나씩 읽어오는 것이 아니라 임시 공간(버퍼)에 저장해두었다가 
		 * 한 번에 출력 또는 데이터를 보내는 방식이다.
		 * 예로 들어 1000개의 데이터를 1개씩 보내는게 아니라 임시로 한 공간에 담아둔 뒤 한 번에 보내는 방법이니 
		 * 당연 성능면에서 우수하다. (속도가 빠르다고 이해하면 빠르다.)
		 */
		
		/* 
		 * 방법 3. StringBuilder 를 이용하는 방법
		 * StringBuilder sb = new StringBuilder();
		 * sb.append("Hello World!");
		 * System.out.println(sb);
		 */
		// 이 또한 BufferedWriter 와 유사하게 데이터를 모아두었다가 한 번에 출력한다. 
		// 특징이 있다면 StringBuilder에서 문자열을 이어 붙인다는 점이다. 
		
		/*
		 * 방법 4. StringBuffer 를 이용하는 방법
		 * StringBuffer sb = new StringBuffer();
		 * sb.append("Hello World!");
		 * System.out.println(sb);
		 */
		// 이 방법은 StringBuilder랑 거의 비슷하다! 
		// 다만 StringBuilder와 차이점이 있다면 StringBuffer은 동기화를 지원한다는 점.
		// 즉, multi-thread 상황에서 문자열이 리소스로 사용된다면 StringBuffer을 사용해주어야 한다. 
		// ( StringBuilder은 동기화를 지원하지 않는다. )
		// 아무래도 동기화를 지원하다 보니 StringBuilder보단 느리지만 그래도 문자열 조작에 있어 String보다 훨씬 빠르다.
		
		/* (정리)
		 * 대략 속도가 빠른순으로 비교해보자면 
		 * BufferedWriter(문자열 한 번에 출력) >> StringBuilder(문자열 이어 붙이기) 
		 * > StringBuffer(동기화 지원) >>>> String
		 */
		
	}
}