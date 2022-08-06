package algorithm;

public class InsertionSort {
	public static void main(String[] args) {
		int[] intArr = {45, 89, 67, 92, 53, 74, 26, 80};
		int i;
		
		// 정렬하기 전 배열을 출력한다.
		System.out.println("정렬 전 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
		
		// 선택 정렬을 사용하여 정렬하기 위해 selectionSort메소드를 출력한다.
		insertionSort(intArr);
		
		// 정렬한 후 배열을 출력한다.
		System.out.print("\n정렬 후 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
	}

	private static void insertionSort(int[] A) {
		int i, j, insertElement;
		int n = A.length;
		
		for(i = 1; i < n; i++) {
			// 배열 A[0...i]를 재배열하여 정렬한다.
			insertElement = A[i];	// A[i]를 저장한다.
			j = i - 1;
			
			// A[i]를 A[0...i - 1]에 삽입할 지수를 찾는다.
			while(j >= 0 && A[j] > insertElement) 
				A[j + 1] = A[j];	// A[j]를 오른쪽으로 한 자리 이동시킨다.
			
			j = j - 1;
				
			// A[i]를 찾는 위치에 삽입한다.
			A[j + 1] = insertElement;
		}
	}
}
