
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N, M
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];

        // 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;

        // 큰 동전부터 시작해서 반복문
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] <= K) {
                count += K / A[i];
                K = K % A[i];
            }
        }

        System.out.println(count);
    }
}
