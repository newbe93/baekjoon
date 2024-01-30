
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// N값 받기
		int N = scan.nextInt();
		
		// 사용변수 초기화
		int count = 1;
		int sum = 1;
		int start_index = 1;
		int end_index = 1;
				
		// while문(end_index가 N에 도달할때까지)
		while(end_index != N) {
			if(sum < N) {
				end_index++;
				sum += end_index;
			} else if(sum > N) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
				count++;
			}
		} // while
		
		System.out.println(count);
	}

}
