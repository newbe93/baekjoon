
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String[] alpha = {"c=", "c-" , "dz=", "d-", "lj", "nj", "s=", "z="};
		int count = 0;
		for(int i=0 ; i<alpha.length ;i++) {
			if(input.indexOf(alpha[i]) != -1) {
				input = input.replace(alpha[i], "!");
			}
		}
		System.out.println(input.length());
		
		
	}

}

