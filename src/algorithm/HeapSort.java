package algorithm;

// p.98 힙 정렬
// 힙은 완전이진트리 형태로 만들어진 자료구조'다.
// 힙 정렬은 '최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로

// (정렬된)리스트에 값을 넣었다 뺄때는, 새 원소가 들어올 때마다
// 이미 리스트에 있던 원소들을 비교를 하고 정렬을 해야한다.
// 이렇게 하면 비효율적이기 때문에 좀 더 효율이 좋게 만들기 위하여 다음과 같은 조건을 붙였다.
// - '부모 노드는 항상 자식 노드보다 우선순위가 높다.'
// 즉, 모든 요소들을 고려하여 우선순위를 정할 필요 없이 부모 노드는 자식노드보다 항상 우선순위가 앞선다는 조건만 만족시킨
// 완전이진트리 형태로 채워나가는 것이다.
// 이러한 원리로 최댓값 혹은 최솟값을 빠르게 찾아낼 수 있다는 장점(시간복잡도 : O(1))과 함께 
// 삽입 삭제 연산시에도 부모노드가 자식노드보다 우선순위만 높으면 되므로 결국 트리의 깊이만큼만 비교를 하면 되기 때문에 
// O(logN)의 시간복잡도를 갖아 매우 빠르게 수행할 수 있다.

/* [성질]
 * 1. 왼쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2
 * 2. 오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2 + 1
 * 3. 부모 노드 인덱스 = (자식 노드 인덱스 - 1) / 2
 */

/* [장점]
 * 1. 최악의 경우에도 O(NlogN) 으로 유지가 된다.
 * 2. 힙의 특징상 부분 정렬을 할 때 효과가 좋다.
 * 
 * [단점]
 * 1. 일반적인 O(NlogN) 정렬 알고리즘에 비해 성능은 약간 떨어진다.
 * 2. 한 번 최대힙을 만들면서 불안정 정렬 상태에서 최댓값만 갖고 정렬을 하기 때문에 안정정렬이 아니다.
 */

/* - 힙의 삽입 연산
 * 1. 트리의 가장 마지막 위치에 노드를 삽입
 * 2. 추가된 노드와 그 부모 노드가 힙 조건을 만족하는지 확인 (힙 조건은 최대힙/최소힙에 따라 다름)
 * 3. 만족하지 않는다면 부모와 자식의 키 값을 바꿈
 * 4. 조건에 만족하거나 추가된 노드가 루트에 도달할 때까지 2~3번을 반복함
 * 완전 이진 트리의 리프 노드부터 루트 노드까지 연산을 함
 * 노드가 N개일 때 수행 시간 O(log N)
 */

/* - 힙의 삭제 연산
 * 1. 힙의 삭제연산은 항상 루트 노드를 삭제
 * 2. 트리의 가장 마지막 노드를 루트 자리로 삽입
 * 3. 바뀐 위치의 노드가 힙 조건을 만족하는지 확인 (힙 조건은 최대힙/최소힙에 따라 다름)
 * 4. 만족하지 않는다면 왼쪽 자식과 오른쪽 자식 중 적합한 노드와 키 값을 바꿈
 * 5. 조건을 만족하거나 리프 노드에 도달할 때까지 3~4번을 반복함.
 * 완전 이진 트리의 리프 노드부터 루트 노드까지 연산을 함
 * 노드가 N개일 때 수행 시간 O(log N)
 */

public class HeapSort {
	public static void main(String[] args) {
		int[] intArr = { 0, 1, 2, 6, 4, 8, 7 };
		int i;

		// 정렬하기 전 배열을 출력한다.
		System.out.print("정렬 전 배열 : ");
		for (i = 1; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");

		// 힙 정렬을 사용하여 정렬하기 위해 heapSort 메소드를 출력한다.
		heapSort(intArr);

		// 정렬한 후 배열을 출력한다.
		System.out.print("\n정렬 후 배열 : ");
		for (i = 1; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");
	}

	// (1) 힙 정렬 메소드 : 배열을 힙 형태로 구현
	private static void heapSort(int[] A) {
		int eh, temp;

		// eh : 힙의 마지막 요소의 지수
		eh = A.length - 1;

		// 주어진 배열을 힙으로 만든다.
		buildHeap(A, eh);
		
		// 힙에서 최댓값을 제거하고 남은 트리를 다시 힙으로 만든다.
		// 루트노드와 인덱스가 동일할 때까지 반복함. (밑에서부터 힙을 만듬.)
		while (eh > 1) {
			// A[1]과 A[eh]를 교환한다.
			temp = A[1];
			A[1] = A[eh];
			A[eh] = temp;

			// 힙에서 최댓값을 제거한다.
			eh = eh - 1;

			// 남은 트리를 다시 힙으로 만든다.
			pushDown(A, 1, eh / 2, eh);
		}
	}

	// 주어진 배열 A[1 ... eh]를 힙으로 만든다.
	// 세부트리의 최대힙 조건을 확인하는 메소드
	private static void buildHeap(int[] A, int eh) {
		int bh, x;
		
		// bh : 부모 인덱스(최대힙 조건)를 확인하는 필드 
		// *bh 초기 : 마지막 인덱스(자식)의 부모 인덱스 => bh = 4라는 결과가 나옴. (마지막 인덱스가 6이다.)
		bh = (A.length - 1) / 2 + 1;

		// A[bh]의 서브트리를 정렬함
		while (bh > 1) {
			bh = bh - 1;			// *초기 bh = 3이라는 결과가 나오면서, (루트노드가 1부터 시작하기 때문에 1을 빼줌)
			x = bh;					// *자식 인덱스 6번의 부모 인덱스로 3번이 저장이 된다. 

			// x에서 힙 조건이 만족될 때까지 A[x]를 트리의 아래 층으로 내려보낸다.
			pushDown(A, x, bh, eh);
		}
	}

	// A[x]를 힙 조건이 만족될 때까지 트리의 아래 층으로 내려 보낸다.
	// 자식노드과 부모노드를 비교해서 교환하는 메소드? (자식만 비교하는 메소드는 별도로 존재) => *초기 3번과 6번 인덱스 비교
	private static void pushDown(int[] A, int x, int bh, int eh) {
		int y, temp;

		y = findLarger(A, x, eh);

		while (A[x] < A[y]) {
			temp = A[x];
			A[x] = A[y];
			A[y] = temp;

			x = y;

			y = findLarger(A, x, eh);
		}
	}

	// A[x]보다 더 큰 값을 가지는 x의 자식 노드의 지수를 구한다.
	// 자식노드만 비교해서 어느 것이 제일 큰 지 확인하는 메소드 => * 
	private static int findLarger(int[] A, int x, int eh) {
		int y = 0;

		// 자식노드가 둘다 있는 경우
		if (2 * x + 1 <= eh) {
			// A[x]보다 더 큰 값을 가지는 자식 노드의 지수를 구한다.
			if (A[2 * x] > A[x] || A[2 * x + 1] > A[x]) {
				// 왼쪽이 더 큰 경우
				if (A[2 * x] >= A[2 * x + 1])		// 왼쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2
					y = 2 * x;
				
				// 오른쪽이 더 큰 경우
				else 		
					y = 2 * x + 1;					// 오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 × 2 + 1
			} 
			// 자식 노드가 하나만 있는 경우
			else
				if (2 * x <= eh && A[2 * x] > A[x])
				y = 2 * x;
		}
		return y;
	}
}
