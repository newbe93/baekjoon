import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 오름차순 정렬을 위한 우선순위 큐 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 우선순위큐에 데이터 저장
        for (int i = 0; i < N; i++) {
            int data = sc.nextInt();
            pq.add(data);
        }

        int count = 0;
        // queue에 남은 데이터가 1개일때까지 반복
        while (pq.size() != 1) {
            int data1 = pq.remove();
            int data2 = pq.remove();
            count += data1 + data2;
            pq.add(data1+data2);
        }

        System.out.println(count);
    }
}
