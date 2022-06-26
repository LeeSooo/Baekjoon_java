package level1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

// - 시간 단축(성능 개선)을 위해 사용 => BufferedReader + StringBuilder
public class bj10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		StringBuilder sb = new StringBuilder();
 
		sb.append( (A+B)%C );
		sb.append('\n');
 
		sb.append( (A%C + B%C)%C );
		sb.append('\n');
 
		sb.append( (A*B)%C );
		sb.append('\n');
 
		sb.append( (A%C * B%C)%C );
 
		System.out.println(sb);
	}
}