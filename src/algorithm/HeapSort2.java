package algorithm;
import java.util.*;
// 메소드 5개 (배열->힙,)

/* [트리(배열)를 힙으로 만드는 과정]
 * 1. 자식이 있는 가장 마지막 부모 노드부터 힙으로 만든다.
 * 2. 거슬러 올라가면서 더 큰 힙을 만든다.
 * 3. root 노드까지 힙으로 만들면 배열 전체가 힙이 된다.
 */

/* [트리(배열)을 힙으로 만드는 방법]
 * 1. 자식 노드가 2개인 경우
 * - 부모 노드와 자식 노드를 비교해서, 가장 큰 값을 가지는 노드의 값을 부모 노드의 값과 교환한다. 
 * (부모 노드의 값이 가장 크다면 교환하지 않는다)
 * 
 * 2. 자식 노드가 한개인 경우
 * - 부모, 자식노드의 값을 비교해서 자식노드의 값이 더 크다면 교환한다. 
 * (아니라면 교환하지 않는다.)
 */

/* [힙을 정렬하는 방법] 
 * 1. root 노드의 값을 바깥으로 빼고, 가장 마지막 leaf노드의 값을 root노드의 값으로 넣는다.
 * (배열에서는 root노드의 값을 가장 마지막 leaf 노드의 값과 교환하고 힙의 크기를 1 줄인다 --> 1개를 뺀 것처럼 동작)
 * 2. 힙의 구조가 깨졌으므로, 다시 힙으로 수정한다.
 * 3. 1번과 2번을 반복하다가, 더이상 뺄 값이 없다면 정렬 완료이다. (힙의 크기가 0이 된 경우)
 */

class HeapSort2 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하시오");
        int n = scanner.nextInt()+1;
        int[] arr = new int[n];

        System.out.println("배열에 들어갈 숫자를 입력하시오");
        for(int i = 1; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("배열에 입력한 숫자");
        System.out.println(Arrays.toString(arr));

        buildHeap(arr); //배열을 힙으로 만드는 메서드

        System.out.println("힙으로 변경한 배열");
        System.out.println(Arrays.toString(arr));

        heapSort(arr); //힙을 이용해서 정렬하는 메서드

        System.out.println("정렬 완료된 배열");
        System.out.println(Arrays.toString(arr));
    }

    // [힙을 정렬하는 방법] 
    private static void heapSort(int[] arr) {
        int endNode = arr.length-1;
        while(endNode > 1) {
            swap(arr, 1, endNode);	// 제일 큰 루트노드를 마지막 인덱스에 삽입하고, 마지막 인덱스를 제외한 힙정렬을 다시 만들어준다.
            endNode--;
            pushDown(arr, 1, endNode);
        }
    }
    
    //eNN = endNodeNumber	(마지막 노드 인덱스)
    //tNN = tempNodeNumber 	(eNN의 부모 노드 인덱스)
    
    // [트리(배열)를 힙으로 만드는 과정]
    private static void buildHeap(int[] arr) {
        int endNode = arr.length - 1; // 마지막 노드
        int tempNode = endNode/2 + 1; //1번째 리프노드 번호

        while(tempNode > 1) {
            tempNode--; // 자식을 가지고 있는 마지막 부모노드부터 시작
            pushDown(arr, tempNode, endNode);
        }
    }

    private static void pushDown(int[] arr, int tempNode, int endNode) {
        int y = findLarger(arr, tempNode, endNode); 
        //자식 노드 중에서 루트 노드보다 더 큰 값을 가지는 노드 번호 얻어냄

        while(arr[tempNode] < arr[y]){
            swap(arr, tempNode, y);
            tempNode = y;
            y = findLarger(arr, tempNode, endNode);
            // leaf노드 쪽으로 내려가면서 값의 제자리를 찾아간다.
        }
    }

    //자식 노드 중에서 루트 노드보다 더 큰 값을 가지는 노드 번호 얻어냄
    private static int findLarger(int[] arr, int tempNode, int endNode){
        int rightNode = tempNode*2+1; 	// 현재 tNN의 오른쪽 자식 노드의 번호
        int largerNode = tempNode;		// 현재 tNN(eNN의 부모)노드의 번호

        if(rightNode <= endNode){//자식 노드가 두개인 경우
            if(arr[tempNode] < arr[rightNode]) //오른쪽 자식 노드의 value가 더 크다면
                largerNode = rightNode;
            if(arr[largerNode] < arr[rightNode-1]) //왼쪽 자식 노드의 value가 더 크다면
                largerNode = rightNode-1;
        }
        else if(rightNode-1 <= endNode){ //자식 노드가 1개인(왼쪽의 자식노드만 존재하는) 경우
            if(arr[tempNode] < arr[rightNode-1]) // 자식 노드의 value가 더 크다면
                largerNode = rightNode-1;
        }
        return largerNode;
    }

    private static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}