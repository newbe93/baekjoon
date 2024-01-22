
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 1;
		int floorMaxNum = 1;
		while(N> floorMaxNum) {
			floorMaxNum += 6*count;
			count++;
		}
		System.out.println(count);
		
	}

}

/*

시작방 1번		1번
2층은 1+ 6 = 7 번까지
3층은 7+ 12		19번
4층	19 + 18		37번
		24		61번
		=> 층계가 1층씩 커질때마다 6의 배수씩 커지는걸 볼수있다.
*/