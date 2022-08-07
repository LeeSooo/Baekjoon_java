package algorithm;

// 삽입 정렬
// 삽입 정렬은 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법이다.

/* - 삽입 정렬의 전체적인 과정(오름차순을 기준)
 * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
 * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
 * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다. 
 */

/* 단순(구현 간단)하지만 비효율적인 방법
 * - 삽입 정렬, 선택 정렬, 버블 정렬
 */

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

	// 삽입 정렬 메소드
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
