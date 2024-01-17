
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] credit = new double[20];
		String[] grade = new String[20];
		double count = 0;
		double sum = 0;
		// 한줄마다 학점과 과목평점을 받아온다.
		for(int i=0 ; i<20 ; i++) {
			double score=0;
			String subject = scan.nextLine();
			String[] arr = subject.split(" ");
			credit[i] = Double.parseDouble(arr[1]);
			grade[i] = arr[2];
			
			if(grade[i].equals("A+")) {
				 score = 4.5;
			} else if(grade[i].equals("A0")) {
				 score = 4.0;
			} else if(grade[i].equals("B+")) {
				 score = 3.5;
			} else if(grade[i].equals("B0")) {
				 score = 3.0;
			} else if(grade[i].equals("C+")) {
				 score = 2.5;
			} else if(grade[i].equals("C0")) {
				 score = 2.0;
			} else if(grade[i].equals("D+")) {
				 score = 1.5;
			} else if(grade[i].equals("D0")) {
				 score = 1.0;
			} else if(grade[i].equals("F")) {
				 score = 0;
			} else if(grade[i].equals("P")) {
				score =0;
			} 
			if(!grade[i].equals("P")) count += credit[i];
			sum += score * credit[i];
		} // for
		System.out.println((double)sum/count);
		
		
		
	}

}
