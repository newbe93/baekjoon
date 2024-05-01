import java.io.*;

public class Main {
    public static int[] A;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정렬할 수 개수
        int N = Integer.parseInt(br.readLine());
        // 정렬할 배열
        A = new int[N];

        // A에 데이터 담기
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        // 정렬하기
        Radix_Sort(A, 5);
        for(int i=0 ; i < N ; i++){
            bw.write(A[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void Radix_Sort(int[] A, int max_size) {
        int[] output = new int[A.length];
        int jarisu = 1;
        int count = 0;

        while (count != max_size) { // 최대 자리수만큼 반복
            int[] bucket = new int[10];
            for (int i = 0; i < A.length; i++) {
                bucket[(A[i] / jarisu) % 10]++; // 자리수에 해당하는 bucket[]에 ++ 해줌
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1]; // 합 배열 이용해 index 계산하기
            }
            for (int i = A.length-1; i >= 0; i--) {
                output[bucket[A[i] / jarisu % 10] - 1] = A[i];
                bucket[(A[i] / jarisu) % 10]--;
            }
            for (int i = 0; i < A.length; i++) {
                A[i] = output[i];
            }
            jarisu = jarisu * 10;
            count++;
        }

    }
}
