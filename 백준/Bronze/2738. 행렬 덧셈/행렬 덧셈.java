
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr1 = new int[N*M];
		int[] arr2 = new int[N*M];
		
		for(int i=0 ; i< N*M ; i++) {
			arr1[i] = scan.nextInt();
		}
		for(int i=0 ; i< N*M ; i++) {
			arr2[i] = scan.nextInt();
		}
		for(int i=0 ; i< N*M ; i++) {
			System.out.print(arr1[i]+arr2[i] + " ");
			if(i%M == M-1) System.out.println();
		}
	}

}
