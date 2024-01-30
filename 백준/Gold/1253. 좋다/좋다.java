
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// N 수의 개수값 받기
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		// 배열 A에 숫자들 받기
		int[] A = new int[N];
		for(int i=0; i<N ; i++) {
			A[i] = scan.nextInt();
		}
		
		// 배열 A 오름차순 정렬
		Arrays.sort(A);
		
		// 사용 변수 초기화
		int count = 0;
		
		// find=A[0] 부터 A[N] 까지 
		for(int i=0 ; i<N ; i++) {
			int find = A[i];
			
			// 포인터 초기화
			int j=0;
			int k=N-1;
			
			// 그안에 while문으로 투포인터 j,k 설정해서 합이 find가 되는 경우를 count
			while(j < k) {
				if(A[j] + A[k] > find) {
					k--;
				} else if(A[j] + A[k] < find) {
					j++;
				} else {
					if(j !=i && k != i) {
						count++;
						break;
					} else if(j == i) {
						j++;
					} else if(k == i) {
						k--;
					}
				}
			}// while
		}// for i
		
		// count 출력
		System.out.println(count);
	}

}
