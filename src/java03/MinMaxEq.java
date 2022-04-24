package java03;

import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.println("정수 b : ");
		int b = stdIn.nextInt();
		
		if(a>b) {
			System.out.println("작은 값은" + b + "이다.");
			System.out.println("큰 값은" + a + "이다.");
		}else if(a<b) {
			System.out.println("작은 값은" + a + "이다.");
			System.out.println("큰 값은" + b + "이다.");
		}else {
			System.out.println("두 값이 같다.");
		}
		
	}

}
