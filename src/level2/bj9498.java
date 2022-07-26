package level2;

// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
// BufferedReader은 String 타입으로 입력되기 때문에 반드시 Integer.parseInt()로 int 형으로 변환해야 함.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj9498 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		System.out.print((input>=90)?"A": (input>=80)? "B": (input>=70)? "C": (input>=60)? "D": "F");
	}
}
