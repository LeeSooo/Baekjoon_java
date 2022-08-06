package algorithm;

// p.87 선택 정렬
// 전체 배열에서 가장 작은 요소를 찾고 그 요소를 배열의 첫 번째 요소와 교환한다. 이러한 과정을 배열 전체에 적용

public class SelectionSort {
	public static void main(String[] args) {
		int[] intArr = {89, 45, 67, 92, 39, 74, 26, 90};
		int i;
		
		// 정렬하기 전 배열을 출력한다.
		System.out.println("정렬 전 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
		
		// 선택 정렬을 사용하여 정렬하기 위해 selectionSort메소드를 출력한다.
		selectionSort(intArr);
		
		// 정렬한 후 배열을 출력한다.
		System.out.print("\n정렬 후 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
	}

	// 선택 정렬 메소드
	private static void selectionSort(int[] A) {
		int i, j, min, temp;
		int n = A.length;
		
		for(i = 0; i < n; i++) {
			// A[i]부터 A[n-1]의 요소들 중 최솟값의 지수를 찾는다.
			min = i;
			for (j = i + 1; j < n; j++)
				if(A[j] < A[min]) min = j;
			
			// A[i]와 A[min]을 교환한다.
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
		
	}

}
