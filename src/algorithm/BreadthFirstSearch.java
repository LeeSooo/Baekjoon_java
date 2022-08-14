package algorithm;

// 프로그램 4-3 너비 우선 탐색
// 주어진 비방향 그래프를 너비우선탐색으로 순회한다.

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	private Queue<Node> queue;	// 방문할 정점들을 저장하는 큐
	
	public BreadthFirstSearch() {
		queue =new LinkedList<Node>();
	}
	
	public void BFS(Node v) {
		// v를 '방문함'으로 표시한다.
		v.visited = true;
		
		// v를 큐에 추가한다.
		queue.add(v);
		
		while(!queue.isEmpty()) {
			// 큐의 맨 앞에 있는 장점을 끄집어내어 element에 저장한다.
			Node element = queue.remove();
			
			// element에 대응된 데이터를 출력한다.
			System.out.print(element.info + " ");
			
			// elemnt에 인접한 정점들의 연결 목록에 끄집어 낸다.
			List<Node> neighbours = element.getNeighbours();
			
			// element에 인접한 방문하지 않은 모든 정점들에 대해
			// 너비 우선 탐색을 수행한다.
			for(int i = 0; i<neighbours.size(); i++) {
				// w는 element에 인접한 정점이다.
				Node w = neighbours.get(i);
				
				if (w != null && !w.visited) {
					// w가 '방문 안함'으로 표시되어 있는 경우
					// w를 '방문함'으로 표시한다.
					w.visited = true;
					queue.add(w); // w를 큐에 추가한다.
				}
			}
		}
	}
	public static void main(String[] arg) {
		// 주어진 비방향 그래프를 연결 목록으로 표현한다.
		
		// 정점들을 표현한다.
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		// 간선들을 표현한다.
		node1.addNeighbours(node2);
		node1.addNeighbours(node3);
		node1.addNeighbours(node5);
		node2.addNeighbours(node1);
		node2.addNeighbours(node3);
		node3.addNeighbours(node1);
		node3.addNeighbours(node2);
		node3.addNeighbours(node4);
		node3.addNeighbours(node5);
		node4.addNeighbours(node3);
		node4.addNeighbours(node6);
		node5.addNeighbours(node1);
		node5.addNeighbours(node3);
		node6.addNeighbours(node3);
		node6.addNeighbours(node4);
		
		BreadthFirstSearch bfsExample
		= new BreadthFirstSearch();
		
		// 주어진 비방향 그래프를 너비 우선 ㅏㅁ색으로 순회한다.
		System.out.println("너비 우선 탐색 실행 결과");
		bfsExample.BFS(node1);
	}
}