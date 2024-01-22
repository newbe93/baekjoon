
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int dot = 2;
		
		for(int i=0 ; i<N ; i++) {
			dot = dot*2 -1;
			
		} // for
		System.out.println(dot*dot);
	}

}

//점 한줄에 
//0 => 2개
//1 => 3개
//2 => 5개
//3 => 9개
//이전것의 2배 -1


