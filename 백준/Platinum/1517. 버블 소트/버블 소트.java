
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] A , tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 숫자 개수 N
        int N = Integer.parseInt(br.readLine());

        // 숫자 배열 A
        A = new int[N+1];
        // 임시 배열 tmp
        tmp = new int[N+1];


        StringTokenizer st = new StringTokenizer(br.readLine());
        // A에 값 넣기
        for(int i=1 ; i<=N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        result = 0;
        // 병합 정렬
        mergeSort(1,N);

        System.out.println(result);
    }

    private static void mergeSort(int s, int e) {
        if( e-s < 1){
            return;
        }

        int m = s + (e-s)/2;

        mergeSort(s,m);
        mergeSort(m+1,e);

        int k = s;
        int index1 = s;
        int index2 = m+1;

        for(int i=s ; i<=e ; i++){
            tmp[i] = A[i];
        }

        while(index1 <= m && index2 <=e){
            if(tmp[index1] > tmp[index2]){
                A[k] = tmp[index2];
                k++;
                index2++;
                result += index2 - k;
            }else{
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }

        while(index1 <= m){
            A[k] = tmp[index1];
            index1++;
            k++;
        }

        while(index2 <= e){
            A[k] = tmp[index2];
            index2++;
            k++;
        }
    }
}
