package java03;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int x = stdIn.nextInt();
		
		System.out.println("정수 b : ");
		int y = stdIn.nextInt();
		
		
		if(x>y) {
			System.out.println("두값의 차는" + (x-y));
		}else if(x<y) {
			System.out.println("두값의 차는" + (y-x));
		}else {
			System.out.println("두 값이 같다");
		}
		
		
	}

}
