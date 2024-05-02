

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
        static int N;
    public static void main(String[] args){
        //자릿수 N 받기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        // 일의자리가 소수인 수 2, 3, 5, 7
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

    }

    static void DFS(int number, int jarisu){
        if(jarisu == N){
            if(isPrime(number)) System.out.println(number);
        }

        if (isPrime(number)) {
            jarisu++;
            for(int i=0 ; i<10 ; i++){
                if (i % 2 !=  0) {
                    DFS(number * 10 + i, jarisu);
                }
            }
        }

    }

    static boolean isPrime(int number){
        for(int i=2 ; i<number/2 ; i++){
            if(number % i ==0) return false;
        }
        return true;
    }
}
