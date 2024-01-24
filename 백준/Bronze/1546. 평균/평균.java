
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			sum += arr[i];
		}
		
		System.out.println((double)sum * 100 / max / N);
	}

}
