package levell25;

// 깊이 우선 탐색
// 첫줄 입력 : 정점 집합, 간선 집합, 시작 정점
// 그 이후 입력 : 해당 정점, 인접 정접 

/* 문제 풀이 */
// 1. 시작정점은 M개  줄의 간선 정보와 무관하게 무조건 1이 나와야 한다.
// 2. 찾아가는 정점의 순서대로 출력이 아니다.
// 2를 시작정점으로 하여 1번째에 방문했으므로 출력 2번재 줄에 1이 출력된다.
// 6을 2번째로 방문했으므로 출력 6번째 줄에 2가 출력된다.

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj24479 {
	static StringBuilder sb = new StringBuilder();
	static int[] result = new int[100001];
	static int cnt = 0; // 순서 카운트

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // 정점 개수
		int m = Integer.parseInt(st.nextToken()); // 간선 개수
		int r = Integer.parseInt(st.nextToken()); // 시작 정점

		LinkedList<Integer>[] graph = new LinkedList[n + 1]; // 그래프

		/* 정점 제작 */
		for (int i = 1; i <= n; i++) {
			graph[i] = new LinkedList<>();
		}
		
		/* 간선 제작 */
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			// 양방향 간선
			graph[v1].add(v2);
			graph[v2].add(v1);
		}
		
		/* 각 정점에 연결된 정점을 오름차순 */
		for (int i = 1; i <= n; i++) {
			Collections.sort(graph[i]);
		}
		
		boolean[] visited = new boolean[n + 1]; // 방문체크배열

		DFS(r, graph, visited); // DFS 탐색 시작!!

		/* 출력 */
		for (int i = 1; i <= n; i++) {
			sb.append(result[i] + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}

	// DFS (깊이 우선 탐색)
	public static void DFS(int r, LinkedList<Integer>[] graph, boolean[] visited) {
		Iterator<Integer> iter = graph[r].listIterator();

		visited[r] = true; // 시작정점은 무조건 방문
		result[r] = ++cnt; // 순서 입력

		while (iter.hasNext()) { // 방문한 정점에 인접한 정점이 있다면
			int w = iter.next(); // 하나씩 읽어 들인다.
			if (!visited[w]) { // 아직 방문하지 않았다면
				DFS(w, graph, visited); // DFS 호출
			}
		}
	}
}