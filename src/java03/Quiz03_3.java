package java03;

import java.util.Scanner;

public class Quiz03_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력하시오");
		int x = stdIn.nextInt();

		
		System.out.println("변수 x의 절대값은 " + (x>=0 ? x : -x));
		
		
	}

}
