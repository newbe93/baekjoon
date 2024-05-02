import java.util.*;
import java.io.*;

public class Main{
        static ArrayList<Integer>[] A;
        static boolean[] visited;
    public static void main(String[] args) throws IOException{
        // Node , Edge 개수 N , M 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // DFS를 위한 자료구조 초기화하기
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        // 인접리스트 A 초기화하기
        for(int i=1 ; i< N+1 ; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            A[start].add(end);
            A[end].add(start);
        }
        
        // DFS
        int count = 0;
        for(int i=1 ; i< N+1 ; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        
        System.out.print(count);
    }
    
    static void DFS(int v){
        if(visited[v]) return;
        visited[v] = true;
        for(int i=0 ; i<A[v].size() ; i++){
            DFS(A[v].get(i));
        }
    }
} 