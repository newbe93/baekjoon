
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String형으로 수 받기
        String str = scan.next();
        // str.length 길이만큼의 배열 A 생성
        int[] A = new int[str.length()];

        // A배열에 수 담기
        for(int i=0; i < str.length() ; i++){
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        // 선택정렬
        for(int i=0 ; i< A.length ; i++){
            int max = i;
            for(int j=i+1 ; j<A.length ; j++){
                if(A[max] < A[j]) max = j;
            }
            if(A[i] < A[max]) {
                 int temp = A[i];
                 A[i] = A[max];
                 A[max] = temp;
            }
        }
        for(int a : A){
            System.out.print(a);
        }
    }
}
