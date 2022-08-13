package levell11;

// [BufferedReader + Collections.sort]

// Arrays.sort()의 경우 : dual-pivot Quicksort 알고리즘 사용.
// 시간복잡도 : O(nlogn) ~ O(n2)

// [문제 해결방법]
// Collections.sort()를 사용하는 방법이다. 
// Collections.sort()은 Timsort(합병정렬 + 삽입정렬)이다.
// 시간복잡도 : O(n) ~ O(nlogn)
// Collections.sort()를 사용하고자 한다면 List 계열(ArrayList, LinkedList 등..)의 자료구조를 사용하여 정렬해야한다.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Boj2751_CollectionsSort {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}