package level3;

// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj2742 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 0; i < n; i++) 
            sb.append(n-i).append('\n');
        System.out.println(sb);
    }
}