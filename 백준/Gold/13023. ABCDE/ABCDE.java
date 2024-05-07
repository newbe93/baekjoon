
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean isExist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // DFS 자료구조 초기화
        A = new ArrayList[N];
        visited = new boolean[N];
        isExist = false;

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }



        for (int i = 0; i < N; i++) {
            DFS(i,1);
            if(isExist) break;

        }
        
        if(isExist) System.out.println(1);
        else System.out.println(0);

    }

    public static void DFS(int v, int depth) {
        if(depth==5){
            isExist=true;
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }

        visited[v] = false;
    }
}
