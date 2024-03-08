
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N 질의개수 받기
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // 우선순위 큐 만들기
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            // 1. 절대값 기준으로 정렬되도록 설정
            // 2. 절대값이 같은 경우 음수 우선 정렬
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1; // 음수가 우선순위를 가진다.
            } else {
                return first_abs - second_abs; // first_abs의 절대값이 작으면 음수를 반환하니까
            }

        });


        // N동안 반복문
        for(int i=1 ; i<= N ; i++){
            int n = scan.nextInt();
            // 요청 0. 0이 들어왔을때 큐가 비어있으면 0을 출력, 아니면 front 출력 poll()
            if(n==0){
                if(myQueue.isEmpty()) System.out.println(0);
                else System.out.println(myQueue.poll());
            } else{ // 요청 1. 0이 아닌값이 들어왔을때 우선순위 큐에 add()
                myQueue.add(n);
            }
        }
    }
}
