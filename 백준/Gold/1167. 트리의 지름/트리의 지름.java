
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Edge>[] A;
    static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 노드의 개수
        int N = sc.nextInt();

        // 자료구조 초기화
        A = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Edge>();
        }

        // 인접리스트에 그래프 데이터 저장하기
        for (int i = 1; i < N + 1; i++) {
            int S = sc.nextInt();
            while (true) {
                int E = sc.nextInt();
                if (E == -1) {
                    break;
                }
                int V = sc.nextInt();
                A[S].add(new Edge(E, V));
            }
        }

        visited = new boolean[N + 1];
        distance = new int[N + 1];
        BFS(1);
        int Max = 1;
        for (int i = 2; i < N + 1; i++) {
            if (distance[Max] < distance[i]) {
                Max = i;
            }
        }

        visited = new boolean[N + 1];
        distance = new int[N + 1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);

    }

    public static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[index] = true;
        queue.add(index);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Edge edge: A[now]) {
                int e = edge.e;
                int value = edge.value;
                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[now] + value;
                }
            }
        }
    }


}

class Edge{
    int e;
    int value;
    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}
