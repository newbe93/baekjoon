import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 숫자의 개수, 퀴즈 개수를 받는다.
			int suNo = Integer.parseInt(st.nextToken());
			int quizNo = Integer.parseInt(st.nextToken());
			
			// 합배열을 위한 배열을 만들어준다.
			long[] S = new long[suNo +1];
			
            // 한줄의 숫자들 받아준다.
            st = new StringTokenizer(br.readLine());
        
			// 숫자를 하나씩 받으며 합배열 만들어준다.
			for(int i=1 ; i<=suNo ;i++) {
				S[i] = S[i-1] + Integer.parseInt(st.nextToken());
			}
			
			// 구간합을 위해 각 i, j받고 구간합 출력
			for(int q=0; q<quizNo; q++) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				System.out.println(S[j] - S[i-1]);
			}
		}
	}


