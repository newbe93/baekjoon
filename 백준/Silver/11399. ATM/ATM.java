
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 사람 수
        int N = scan.nextInt();
        // 걸리는 시간 배열 A
        int[] A = new int[N];
        // 배열 A의 합배열 S
        int[] S = new int[N];

        // 배열 A에 저장
        for(int i=0 ; i<N ; i++){
            A[i] = scan.nextInt();
        }

        // A 배열 삽입 정렬
        for(int i= 1 ; i<N ; i++){
            // insert할 index와 그 값
            int insert_point = i;
            int insert_value = A[i];
            for(int j = i-1 ; j>= 0 ; j--){ // 삽입 가능한 범위에서
                // 현재 insert할 값이 삽입가능 범위의 어떤 값보다 크다면 그 값의 index바로
                // 뒤 index가 insert_point
                if(A[j] < A[i]){
                    insert_point = j+1;
                    break;
                }
                if(j==0){ // 현재 insert할 값이 insert 가능범위중 가장 작다면 제일 앞에 삽입
                    insert_point = 0;
                }
            }// for j
            for(int j=i ; j > insert_point ; j--){
                // insert할 값의 index부터 insert_point까지 한칸씩 뒤로 밀기
                A[j] = A[j-1];
            }
            // insert_point에는 insert_value 값 들어감
            A[insert_point] = insert_value;
        }
        S[0] = A[0];
        for(int i=1 ; i<N ; i++){
            S[i] = S[i-1] + A[i];
        }
        int sum =0;
        for(int i=0 ; i<N ; i++){
            sum += S[i];
        }
        System.out.println(sum);
    }
}
