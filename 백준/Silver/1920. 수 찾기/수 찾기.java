
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        // 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(A);

        // 찾아야할 숫자 개수
        int M = sc.nextInt();
        boolean find = false;

        for (int i = 0; i < M; i++) {
            int search = sc.nextInt();
            int start = 0;
            int end = N-1;
            find = false;

            while (start <= end) {
                int mid = (start+end)/2;
                if (search > A[mid]) {
                    start = mid+1;
                } else if (search < A[mid]) {
                    end = mid-1;
                }else {
                    find = true;
                    break;
                }
            }

            if(find) System.out.println(1);
            else System.out.println(0);

        }
    }
}
