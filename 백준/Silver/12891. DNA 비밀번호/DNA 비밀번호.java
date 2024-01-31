
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	// 현재 상태받을 배열 생성
	static int[] myArr = new int[4];
	// 체크어레이
	static int[] checkArr = new int[4];
	// 4개의 체크어레이 문자중 몇개나 충족하는지 체크해줄 변수
	static int checknum = 0;
	public static void main(String[] args) throws IOException {
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// DNA 문자열길이 S와 부분문자열길이 P를 저장
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		// DNA 문자열 A 저장
		char[] A = new char[S];
		A = br.readLine().toCharArray();
		
		// 체크어레이 받기
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<4 ; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i]==0) checknum++;
		}
		
		// 먼저 배열의 처음부터 P길이 만큼의 윈도우를 적용시켜 판단하기
		for(int i=0 ; i<P ; i++) {
			add(A[i]);
		}
		// 
		if(checknum == 4) {
			result++;
		}
		
		
		// P를 S까지 이동시키며 반복
		for(int i=P ; i<S ; i++) {
			int j= i-P;
			add(A[i]);
			remove(A[j]);
			if(checknum == 4) {
				result++;
			}
		}
		//
		System.out.println(result);
		
		
	}
	// 추가하는 함수
	public static void add(char c) {
		if(c == 'A'){
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checknum++;
		}
		else if(c == 'C'){
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checknum++;
		}
		else if(c == 'G'){
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checknum++;
		}
		else if(c == 'T'){
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checknum++;
		}
	}
	// 빼는함수
	public static void remove(char c) {
		if(c == 'A'){
			if(myArr[0] == checkArr[0]) {checknum--;}
			myArr[0]--;
		}
		else if(c == 'C'){
			if(myArr[1] == checkArr[1]) {checknum--;}
			myArr[1]--;
		}
		else if(c == 'G'){
			if(myArr[2] == checkArr[2]) {checknum--;}
			myArr[2]--;
		}
		else if(c == 'T'){
			if(myArr[3] == checkArr[3]) {checknum--;}
			myArr[3]--;
		}
	}
}
