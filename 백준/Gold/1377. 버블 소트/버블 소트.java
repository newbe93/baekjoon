
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N 값 받기
        int N = Integer.parseInt(br.readLine());
        // 데이터 배열 A 생성
        mData[] A = new mData[N];
        // 배열 A 저장하기
        for(int i=0 ; i<= N-1 ; i++){
           A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        // 배열 A 정렬하기
        Arrays.sort(A);

        int max = 0;
        //for
        for(int i=0 ; i<= N-1 ; i++){
            // 현재 index와 이전 index 위치 비교해서 max 값 찾기
            if(max < A[i].index - i) max = A[i].index - i;
        }

        System.out.println(max+1);
    }


}

class mData implements Comparable<mData>{
    int value;
    int index;

    public mData(int value, int index){
        this.value = value;
        this.index = index;
    }


    @Override
    public int compareTo(mData o) {
        return this.value- o.value;
    }
}