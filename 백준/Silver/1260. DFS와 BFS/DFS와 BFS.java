import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 노드개수 N , 엣지개수 M , 시작노드 V
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 인접리스트 등 자료구조 초기화
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            A[start].add(end);
            A[end].add(start);
        }

        for (int i = 1; i < N + 1; i++) {
            Collections.sort(A[i]);
        }

        DFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V);

       
    }

    public static void DFS(int v) {
        if(visited[v]) return;
        visited[v] = true;
        System.out.print(v + " ");

        for (int i : A[v]) {
            DFS(i);
        }
    }

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : A[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }


    }
}
