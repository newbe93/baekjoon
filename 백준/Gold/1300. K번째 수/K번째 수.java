import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N2 10^9 이라서 반복문으로는 안된다 => 이진탐색
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int start = 1;
        int end = K;
        int ans = 0;

        while (start <= end) {
            int count = 0;
            int middle = (start+end)/2;
            for (int i = 1; i <= N; i++) {
                if(middle/i > N) count = count + N;
                else count += middle / i;
            }
            if(count < K) start = middle+1;
            else {
                end = middle-1;
                ans = middle;
            }
        }
        System.out.println(ans);
    }
}
