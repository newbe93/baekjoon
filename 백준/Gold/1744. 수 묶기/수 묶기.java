
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 자료구조 초기화
        PriorityQueue<Integer> pluspq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minuspq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        int sum = 0;

        // 데이터 분류해서 저장하기
        for (int i = 0; i < N; i++) {
            int data = sc.nextInt();
            if (data > 1) {
                pluspq.add(data);
            } else if (data == 1) {
                one++;
            } else if (data == 0) {
                zero++;
            } else {
                minuspq.add(data);
            }
        }

        // 양수 우선순위 큐에 데이터 2개 보다 적게 남을때까지 while문 돌리기
        while (pluspq.size() >= 2) {
            int data1 = pluspq.remove();
            int data2 = pluspq.remove();

            sum += data1 * data2;
        }

        if (!pluspq.isEmpty()) {
            int data1 = pluspq.remove();
            sum += data1;
        }

        // 음수 우선순위 큐
        while (minuspq.size() >= 2) {
            int data1 = minuspq.remove();
            int data2 = minuspq.remove();

            sum += data1 * data2;
        }

        if (!minuspq.isEmpty()) {
            if (zero == 0) {
                int data1 = minuspq.remove();
                sum += data1;
            }
        }

//        while (one > 0) {
//            sum++;
//            one--;
//        }
        sum += one;

        System.out.println(sum);
    }
}
