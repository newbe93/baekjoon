import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 강의 수 N
        int N = sc.nextInt();
        // 블루레이 수 M
        int M = sc.nextInt();

        // 강의 길이 저장
        int[] A = new int[N];
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if(start < A[i]) start = A[i];
            end += A[i];
        }

        //이진탐색시작
        while (start <= end) {
            int middle = (start + end)/2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (sum + A[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum += A[i];
            }
            if(sum !=0) count++;
            if(count > M) start = middle+1;
            else end = middle-1;

        }
        System.out.println(start);

    }
}
