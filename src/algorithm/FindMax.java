package algorithm;

// 최댓값 찾기 알고리즘
// 자바로 쉽게 배우는 알고리즘 - p.26
public class FindMax {
	public static void main(String[] args) {
		FindMax fm = new FindMax();
		int[] arr = new int[] {20, 30, 67, 2, 94, 47};
		int max = fm.findMaximum(arr);
		System.out.println(max);
	}

	private int findMaximum(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

}
