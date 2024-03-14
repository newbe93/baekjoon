
import java.io.*;

public class Main {
    public static int[] A, tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정렬할 개수 N
        int N = Integer.parseInt(br.readLine());
        // 정렬할 배열 A
        A = new int[N+1];
        // 정렬할때 잠시 사용할 임시 배열 tmp
        tmp = new int[N+1];

        // A에 데이터 담기
        for(int i=1 ; i<=N ; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        // 병합 정렬
        mergeSort(1,N);
        //
        for(int i=1 ; i<= N ; i++){
            bw.write(A[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void mergeSort(int s, int e){
        // 시작점과 종료점이 같아지면 그냥 return
        if( e - s < 1){
            return;
        }
        // 중간점 m
        int m = s + (e-s)/2;
        mergeSort(s,m);
        mergeSort(m+1,e);

        //tmp에 A 복사
        for(int i=s ; i<=e ; i++){
            tmp[i] = A[i];
        }

        int k = s;
        int index1 = s;
        int index2 = m+1;

        while(index1 <= m && index2 <= e){ // 두 그룹 병합하는 로직
            // 양쪽 그룹의 index가 가르키는 값을 비교해 더 작은 수를 선택해 배열에 저장
            // 선택된 그룹의 index는 오른쪽으로 한칸 이동
            if(tmp[index1] > tmp[index2]){
                A[k] = tmp[index2];
                k++;
                index2++;
            }else {
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }//while

        // 한쪽그룹의 index가 끝에 도달했을때 나머지 그룹의 남아있는 값드 정리하기
        while(index1 <=m){
            A[k] = tmp[index1];
            k++;
            index1++;
        }

        while(index2 <= e){
            A[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
