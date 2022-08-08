package algorithm;

// p.91 삽입 정렬
// 삽입 정렬은 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법이다.

// 데이터를 '비교'하면서 찾기 때문에 '비교 정렬'이며
// 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하지 않기 때문에 '제자리 정렬(in-place sort)'이기도 하다.
// 정확히는 데이터를 서로 교환하는 과정(swap)에서 임시 변수를 필요로 하나, 
// 이는 충분히 무시할 만큼 적은 양이기 때문에 제자리 정렬로 보는 것이다. 이는 선택정렬과도 같은 부분이다.
// 그리고 이전에 다뤘던 선택 정렬과는 달리 삽입 정렬은 '안정 정렬'이다.

/* - 삽입 정렬의 전체적인 과정(오름차순을 기준)
 * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
 * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
 * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다. 
 */

/*
 * [장점]
 * 1. 추가적인 메모리 소비가 작다.
 * 2. 거의 정렬 된 경우 매우 효율적이다. 즉, 최선의 경우 O(N)의 시간복잡도를 갖는다.
 * 3. 안장정렬이 가능하다.
 * 
 * [단점]
 * 1. 역순에 가까울 수록 매우 비효율적이다. 즉, 최악의 경우 O(N2)의 시간 복잡도를 갖는다.
 * 2. 데이터의 상태에 따라서 성능 편차가 매우 크다. 
 */

public class InsertionSort {
	public static void main(String[] args) {
		int[] intArr = {45, 89, 67, 92, 53, 74, 26, 80};
		int i;
		
		// 정렬하기 전 배열을 출력한다.
		System.out.print("정렬 전 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
		
		// 선택 정렬을 사용하여 정렬하기 위해 selectionSort메소드를 출력한다.
		insertionSort(intArr);
		
		// 정렬한 후 배열을 출력한다.
		System.out.print("\n정렬 후 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
	}

	// 삽입정렬을 하고, 나머지 요소들을 정렬하는 메소드
	private static void insertionSort(int[] A) {
		int i, j, insertElement;	// i : 삽입할 요소		// j : 삽입할 위치
		int n = A.length;
		
		// 배열 A[0...i]를 재배열하여 정렬한다.
		for(i = 1; i < n; i++) {	// 삽입할 위치를 찾기
			insertElement = A[i];	// 삽입할 요소 = A[i]를 저장한다.
			j = i - 1;				// 비교하는 인덱스 j
			
			// A[i]를 A[0...i - 1]에 삽입할 지수(위치)를 찾는다.
			while(j >= 0 && A[j] > insertElement) {
				A[j + 1] = A[j];	// A[j]를 오른쪽으로 한 자리 이동시킨다.
			
				// A[i]를 찾는 위치에 삽입한다.
				j = j - 1;
				A[j + 1] = insertElement;
			}
		}
	}
}
