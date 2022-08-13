package levell11;

// [선택 정렬(Selection Sort) + BufferedReader + StringBuilder]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj2750_SelectionSort {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		// Selection sort
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int val : arr) {
			sb.append(val).append('\n');
		}
		System.out.println(sb);
	}
}