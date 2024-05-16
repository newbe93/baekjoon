
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][2];

        // A에 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        // 회의 끝나는 시간이 작은순으로 정렬 만약 같은시간에 끝난다면 시작시간이 이른순으로 정렬
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if (S[1] == E[1]) {
                    return S[0] - E[0];
                }
                return S[1] - E[1];
            }
        });

        int count = 1;
        int end = A[0][1];
        // N 만큼 반복문 돌며 회의시작시간이 전 회의 종료시간보다 큰 경우 회의가능 count++
        for (int i = 1; i < N; i++) {
            if(A[i][0] >= end){
                count++;
                end = A[i][1];
            }

        }

        System.out.println(count);


    }




}
