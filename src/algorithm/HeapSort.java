package algorithm;

// 힙 정렬
// 힙은 '최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조'다.

public class HeapSort {
	public static void main(String[] args) {
		int[] intArr = { 0, 1, 2, 6, 4, 8, 7 };
		int i;

		// 정렬하기 전 배열을 출력한다.
		System.out.println("정렬 전 배열 : ");
		for (i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");

		// 선택 정렬을 사용하여 정렬하기 위해 selectionSort메소드를 출력한다.
		heapSort(intArr);

		// 정렬한 후 배열을 출력한다.
		System.out.print("\n정렬 후 배열 : ");
		for (i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");

	}

	private static void heapSort(int[] A) {
		int eh, temp;

		eh = A.length - 1;

		// 주어진 배열을 힙으로 만든다.
		buildHeap(A, eh);
		while (eh > 1) {
			// A[1]과 A[eh]를 교환한다.
			temp = A[1];
			A[1] = A[eh];
			A[eh] = A[1];

			// 힙에서 최댓값을 제거한다.
			eh = eh - 1;

			// 남은 트리를 다시 힙으로 만든다.
			pushDown(A, 1, eh / 2, eh);
		}
	}

	// 배열 A[1 ... eh]를 힙으로 만든다.
	private static void buildHeap(int[] A, int eh) {
		int bh, x;

		bh = (A.length - 1) / 2 + 1;

		while (bh > 1) {
			bh = bh - 1;
			x = bh;

			// x에서 힙 조건이 만족될 때까지 A[x]를 트리의 아래 층으로 내려보낸다.
			pushDown(A, x, bh, eh);
		}
	}

	// A[x]를 힙 조건이 만족될 때까지 트리의 아래 층으로 내려 보낸다.
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
	private static int findLarger(int[] A, int x, int eh) {
		int y = 0;

		if (2 * x + 1 <= eh) {
			// 자식노드가 둘다 있는 경우
			if (A[2 * x] > A[x] || A[2 * x + 1] > A[x]) {
				// A[x]보다 더 큰 값을 가지는 자식 노드의 지수를 구한다.
				if (A[2 * x] >= A[2 * x + 1])
					y = 2 * x;
			} else if (2 * x <= eh && A[2 * x] > A[x])
				y = 2 * x;
		}
		return y;
	}
}
