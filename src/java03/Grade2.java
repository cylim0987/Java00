package java03;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수는 : ");
		int x = stdIn.nextInt();
		
		if(x < 0 || x > 100) {
			System.out.println("잘못된 점수다.");
		}
		else if(x <= 49) {
			System.out.println("가");
		}
		else if(x <= 59) {
			System.out.println("양");
		}
		else if(x <= 69) {
			System.out.println("미");
		}
		else if(x <= 79) {
			System.out.println("우");
		}
		else {
			System.out.println("수");
		}
	}

}
