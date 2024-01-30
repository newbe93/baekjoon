
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 재료개수 N , 갑옷 번호 M 받기
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		// 재료 고유번호 저장
		int[] A = new int[N];
		for(int i=0 ; i<N ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 A 정렬
		Arrays.sort(A);
		
		// 사용 변수 초기화
		int count = 0;
		
		// 투포인터 설정
		int i=0;
		int j=N-1;
		// while문 돌리며 투포인터 설정하여 구하기
		while(i < j) {
			if(A[i] + A[j] < M) {
				i++;
			}else if(A[i] + A[j] > M) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		} // while
		
		System.out.println(count);
		
		
	}

}
