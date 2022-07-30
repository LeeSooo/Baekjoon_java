package level4;

// 문제 : 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

// HashSet : 자바 Collection 중 Set의 파생클래스이다.
// set은 집합이라고 생각하면 되는데, HashSet의 경우,
// (1) 중복원소를 허용하지 않는다.(중복되는 원소를 넣을 경우 하나만 저장)
// (2) 순서의 개념이 없음 (만약 정렬을 하고 싶으면, 리스트로 변환 후 정렬)

import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj3052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
 
		// //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		for (int i = 0; i < 10; i++) 
			h.add(Integer.parseInt(br.readLine()) % 42);
		
		System.out.print(h.size());
	}
}