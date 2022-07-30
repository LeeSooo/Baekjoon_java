package level3;

// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
// while문과 for문의 성능 차이는 없다고 보아도 무방.
/*단순히 메소드의 수행시간만 판단하는 것이 아닌

어떠한 방법이 캐스팅 또는 파싱을 조금이나마 덜 하는지, 순간 별로 메모리를 최소화 할 수 있는 구조는 무엇일지 고민해보기! 
(불필요한 데이터를 최소화 하기)
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj2741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
        
		int i = 1;
		StringBuilder sb = new StringBuilder();
        
		while(i<= N) {
			sb.append(i+"\n");
			i++;
		}
		System.out.println(sb);
	}
}
 
 