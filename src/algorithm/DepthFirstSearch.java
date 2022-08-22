package algorithm;

// 프로그램 4-1 깊이 우선 탐색
// 주어진 비방향 그래프를 깊이 우선 탐색으로 순회한다.

// 깊이 우선 탐색 : 시작점을 기준으로 인접해있는 정점들을 차례대로 이동하는 방식 (순서를 기준)
// 입력 : 그래프 G = (V, E)
// 출력 : 방문하는 순서대로 출력된 정점들

/* [깊이 우선 탐색 알고리즘]
 * 1. V에 있는 각 정점을 전부 다 '방문 안함'으로 표시한다.
 * 2. v가 '방문안함'이라면 DFS(v)를 호출한다.
 */

/* [시간 복잡도]
 * 인접 [목록] 그래프 : 정점의 개수 + 간선의 개수 만큼의 시간 복잡도가 걸림
 * (각 정점을 정확히 한 번 방문하고 각 간선도 두 번 고려하기 때문)
 */	

import java.util.List;

public class DepthFirstSearch {
	// 정점 v에 연결된 방문하지 않은 정점들을 깊이 우선 탐색을 이용하여 재귀적으로 방문한다.
	public static void DFS(Node v) {
		// 정점 v에 대응된 데이터를 출력한다.
		System.out.print(v.info + " ");
		
		// 정점 v를 '방문함'으로 표기한다.
		v.visited = true;
		
		// 정점 v에 인접한 정점들의 연결 목록을 끄집어 낸다.
		List<Node> neighbours = v.getNeighbours();
		
		// 정점 v에 인접한 방문하지 않은 모든 정점들에 대해 깊이우선 탐색을 수행한다.
		for (int i = 0; i < neighbours.size(); i++) {
			Node w = neighbours.get(i);
			if(w != null && !w.visited)
				DFS(w);
		}
	}
	
	public static void main(String args[]) {
		// 주어진 비방향 그래프를 연결 목록으로 표현한다.
		
		// 정점들을 표현한다.
		Node[] node = new Node[6];
		
		for(int i = 0; i < 6; i++)
			node[i] = new Node(i + 1);
		
		// 간선들을 표현한다.
		node[0].addNeighbours(node[1]);
		node[0].addNeighbours(node[2]);
		node[0].addNeighbours(node[4]);
		node[1].addNeighbours(node[0]);
		node[1].addNeighbours(node[2]);
		node[2].addNeighbours(node[0]);
		node[2].addNeighbours(node[1]);
		node[2].addNeighbours(node[3]);
		node[2].addNeighbours(node[4]);
		node[3].addNeighbours(node[2]);
		node[3].addNeighbours(node[5]);
		node[4].addNeighbours(node[0]);
		node[4].addNeighbours(node[2]);
		node[5].addNeighbours(node[2]);
		node[5].addNeighbours(node[3]);
		
		// 주어진 비방향 그래프를 깊이 우선 탐색으로 순회한다.
		System.out.println("재귀를 사용한 깊이 우선 탐색 실행 결과");
		dfs(node[0]);
	}

	private static void dfs(Node node) {
		System.out.println(node.getInfo() + " ");	// 정점 대응된 데이터를 출력한다.
		node.setVisited(true);						// 해당 노드를 방문함으로 표시
		
		List<Node> neighbours = node.getNeighbours();	// 정점에 인접한 연결 목록들을 저장
		
		for(Node n : neighbours) {
			if(n != null && !n.isVisited()) {	// 방문했는지 안했는지 확인
				dfs(n);							// 방문하지 않았으면 내려가서 연결함.
			}
		}
	}

}
