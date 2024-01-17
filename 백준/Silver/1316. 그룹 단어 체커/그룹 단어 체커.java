
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		for(int i=0 ; i< N ; i++) {
			String str = scan.next();
			boolean group = false;
			for(int j=0 ; j<str.length(); j++) {
				if(str.indexOf(str.charAt(j), j+1) == -1) {
					group = true;
					continue;
				} else if(str.indexOf(str.charAt(j), j+1) > j+1) {
					group = false;
					break;
				} else {
					group = true;
					continue;
				}
			}// for j
			if(group) count++;
		}// for i
		System.out.println(count);
	}

}
