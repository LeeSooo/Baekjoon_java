package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class onlyHeap {
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
        int tmp = tempNode*2+1; 	// 현재 tNN의 오른쪽 자식 노드의 번호
        int y = tempNode;		// 현재 tNN(eNN의 부모)노드의 번호

        if(tmp <= endNode){//자식 노드가 두개인 경우
            if(arr[tempNode] < arr[tmp]) //오른쪽 자식 노드의 value가 더 크다면
                y = tmp;
            if(arr[y] < arr[tmp-1]) //왼쪽 자식 노드의 value가 더 크다면
                y = tmp-1;
        }
        else if(tmp-1 <= endNode){ //자식 노드가 1개인(왼쪽의 자식노드만 존재하는) 경우
            if(arr[tempNode] < arr[tmp-1]) // 자식 노드의 value가 더 크다면
                y = tmp-1;
        }
        return y;
    }

    private static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
