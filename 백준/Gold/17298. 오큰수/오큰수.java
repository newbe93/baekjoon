
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 수열 배열
		int[] A = new int[N];
		// 정답 배열
		int[] ans = new int[N];
		String[] str = br.readLine().split(" ");
		
		for(int i=0 ; i< N ; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0); // 최초 스택 push
		
		for(int i = 1 ; i < N ; i++) {
			
			// 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 큰 경우
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<N ; i++) {
			bw.append(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		
		
	}

}
