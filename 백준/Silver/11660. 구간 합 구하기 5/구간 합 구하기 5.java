
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 배열의 크기 N , 질의 개수 M 받기
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// 배열의 크기만큼의 원본배열 만들기
			int[][] A = new int[N+1][N+1];
			
			// 배열에 값 받기
			for(int i=1 ; i<=N ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=1 ; j<=N ; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 배열 크기만큼의 합배열 만들기
			int[][] D = new int[N+1][N+1];
			
			// 합배열 값 집어넣기
			for(int i=1 ; i<=N ; i++) {
				for(int j=1 ; j<=N ; j++) {
					D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
				}
			}
			
			// 구간합 출력하기
			for(int i=0 ; i<M ; i++) {
				st = new StringTokenizer(br.readLine());
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				int x2 = Integer.parseInt(st.nextToken());
				int y2 = Integer.parseInt(st.nextToken());
				System.out.println(D[x2][y2] - D[x2][y1-1] - D[x1-1][y2] + D[x1-1][y1-1]);
			}
			
		}
	}


