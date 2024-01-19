
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int N = scan.nextInt();
		int decimal = 0;
		int sum = 0;
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) >= 'A') {
				 decimal = str.charAt(i) - 'A' + 10;
				
			} else {
				decimal = str.charAt(i) - '0';
			}
			 sum += decimal * Math.pow(N, str.length()-i-1);
		}
		System.out.println(sum);
	}

}
