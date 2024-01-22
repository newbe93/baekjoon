import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int decimalNumber = scan.nextInt();
		int base = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		while(decimalNumber >0) {
			int remainder = decimalNumber % base;
			if(remainder >=10) sb.append((char)((remainder)-10+'A'));
			else sb.append(remainder);
			decimalNumber /= base;
		}
		
		System.out.println(sb.reverse().toString());
			
		}
		

	}










