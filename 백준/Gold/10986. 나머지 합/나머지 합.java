import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 수열의 숫자 개수 N , 나누는 수 M 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 답
		long answer = 0;
		
		// 구간합 배열 S와 구간합을 M으로 나눳을때 나머지 값의 개수를 카운트할 배열 C 생성
		long[] S = new long[N];
		long[] C = new long[M];
		
		// 구간합배열 index 0 받기
		S[0] = sc.nextInt();
		
		// 구간합배열 채우기
		for(int i = 1; i<N ; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		// 구간합배열 M으로 나눈 나머지 구하기
		for(int i=0 ; i<N ; i++) {
			// 합배열의 모든 값에 % 연산 수행하기
			int remainder = (int)(S[i] % M);
			
			// 구간합%연산 수행결과 0이면 정답수 +1
			if(remainder == 0) answer++;
			C[remainder]++;
		}
		
		for(int i=0 ; i<M ; i++) {
			// %수행결과인 나머지가 같은 인덱스중 2개를 뽑는 경우의수
			if(C[i] > 1) {
				answer = answer + (C[i]  * (C[i]-1)) /2;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
