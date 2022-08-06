package algorithm;

// 이진탐색은 탐색할때마다 탐색 범위가 반으로 줄어든다.
// [중요!] 이진탐색을 하기위해서는 배열이 정렬되어 있어야 한다.
// 시간 복잡도 : O(logN)

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int key = Integer.parseInt(in.nextLine());
        String[] s = in.nextLine().split("\\s+");

        int n = s.length;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) 
            data[i] = Integer.parseInt(s[i]);
        
        // 배열 정렬 후, 이진탐색 시도!
        Arrays.sort(data);
        int result = binarySearch(data, key);

        System.out.println(result);

        in.close();
    }

    static int binarySearch(int arr[], int x) {
    	// 초기 상한선과 하한선을 설정
        int upperBound = arr.length-1;
        int lowerBound = 0;
        int median;

        while(true){
        	// 상한선보다 하한선이 더 크면 자료가 없다는 것을 의미!
            if(upperBound<lowerBound)
                return -1;
            
            // 중간 : 총 개수 / 2
            median = (upperBound+lowerBound)/2;

            if(arr[median] == x)
                return median;
            
            else if(arr[median] > x)
                upperBound = median-1;
            
            else
                lowerBound = median+1;
        }
    }
}
