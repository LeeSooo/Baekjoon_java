package algorithm;

// - 정렬 : 데이터를 특정한 조건에 따라 일정한 순서가 되도록 다시 배열하는 일!!

// p.87 선택 정렬
// 선택정렬은 조건(최소값, 최대값)을 선택하고, 정렬하는 알고리즘이다.

// 데이터를 '비교'하면서 찾기 때문에 '비교 정렬'이며
// 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하지 않기 때문에 '제자리 정렬(in-place sort)'이기도 하다.

/* - 선택 정렬의 전체적인 과정
 * 1. 주어진 리스트에서 최소값(조건)을 찾는다.
 * 2. 최소값(조건)을 맨 앞 자리의 값과 교환한다.
 * 3. 맨 앞 자리를 제외한 나머지 인덱스들도 최소값을 찾아 위와 같은 방법으로 반복한다. 
 */

/* [장점]
 * 1. 추가적인 메모리 소비가 작다.
 * 
 * [단점]
 * 1. 시간복잡도가 O(N2) 이다.
 * 2. 안정 정렬이 아니다.
 */

public class SelectionSort {
	public static void main(String[] args) {
		int[] intArr = {89, 45, 67, 92, 39, 74, 26, 90};
		int i;
		
		// 정렬하기 전 배열을 출력한다.
		System.out.print("정렬 전 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
		
		// 선택 정렬을 사용하여 정렬하기 위해 selectionSort메소드를 출력한다.
		selectionSort(intArr);
		
		// 정렬한 후 배열을 출력한다.
		System.out.print("\n정렬 후 배열 : ");
		for(i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
	}

	// 선택 정렬 메소드 : 조건(최소값) 선택 정렬(오름차순 : 1~100) 
	// 조건을 (최소값)으로 선택하여 정렬하는 알고리즘.
	private static void selectionSort(int[] A) {
		int min; 		// 조건 : 최소값을 저장하는 필드
		int temp;		// 교환을 하기 위해 임시로 저장되는 필드
		
		// A[i]부터 A[n-1]의 요소들 중 for문을 이용하여 최소값을 찾는다.
		// i는 이동 시킬 위치를 가리킴!
		for(int i = 0; i < A.length - 1; i++) {
			min = i;	
			
			// 최소값을 찾는 방법 : 모든 값을 비교해보기(for문과 if문 이용)
			// j는 비교할 대상을 가리킴!
			for (int j = i + 1; j < A.length; j++) {
				if(A[j] < A[min]) 
					min = j;
			}
			
			// A[i]와 A[min]을 교환한다.
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
		
	}

}
