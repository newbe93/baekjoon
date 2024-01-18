import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] box = new int[N];
		for(int i=0 ; i<N ; i++) {
			box[i] = i+1;
		}
		while(M>0) {
			int left = scan.nextInt()-1;
			int right = scan.nextInt()-1;
			
			while(left < right) {
				int temp = box[left];
				box[left++] = box[right];
				box[right--] = temp;
			}
			
			
			M--;
		}
		for(int data : box) {
			System.out.print(data + " ");
		}
	}

}