package java03;

import java.util.Scanner;

public class Quiz03_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력하시오");
		int x = stdIn.nextInt();

		if(x % 10 == 0)
		System.out.println("x의 마지막 자릿수는 0");
		
		
	}

}
