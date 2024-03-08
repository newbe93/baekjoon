

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N 과 Queue 생성하기
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();

        // 큐에 카드 저장하기
        for(int i=1 ; i<= N ; i++){
            myQueue.add(i);
        }

        // 1장 남을때까지 Loop
        while(myQueue.size() > 1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        System.out.println(myQueue.poll());
    }
}
