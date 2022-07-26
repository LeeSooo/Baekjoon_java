package level2;
// 오븐 시계
/* 
 * 알고리즘 접근 방법
 * 1. A(시)와 B(분)을 하나의 분으로 변환한 뒤, C를 더하고 나온 결과 값을 다시 시와 분으로 변환하는 방법
 * 2. C를 시와 분으로 변환한 뒤, 각 나뉘어진 시와 분을 A와 B에 각각 더하여 연산하는 방법
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class bj2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
 
        int C = Integer.parseInt(br.readLine());
 
        int min = 60 * A + B;   // 시 -> 분
        min += C;
 
        int hour = (min / 60) % 24;
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
    }
}