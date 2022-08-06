package algorithm;

// 순차탐색은 차례대로 값을 비교해가면서 찾는 것이다.
// 배열을 순차대로 확인해보고, 7이 확인되면 탐색을 종료하는 것이다.
// 시간복잡도 : O(n)

import java.util.Scanner;

public class SequentialSearch {
    public static void main(String args[]) {
    	// 배열 입력
        Scanner sc = new Scanner(System.in);
        int key = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split("\\s+");
        int n = s.length;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) 
            data[i] = Integer.parseInt(s[i]);
        
        // 순차탐색
        int result = sequentialSearch(data, key);

        System.out.println(result);

        sc.close();
    }
    
    public static int sequentialSearch(int arr[], int key) {
        int[] array = arr;
        int rt = 0;
        for(int i = 0; i < arr.length; i++){
            if(array[i]==key){
                rt = i; 
                break;
            }
            rt = -1;
        }
        return rt;
    }
}
