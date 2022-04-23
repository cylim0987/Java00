package java03;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("변수 a :");
		int x = stdIn.nextInt();
		
		System.out.print("변수 b :");
		int y = stdIn.nextInt();
		
		if(x > y) {
			System.out.println("변수 a가 b보다 크다");
		}else if(x == y) {
			System.out.println("변수 a와 b가 같다");
		}else {
			System.out.println("변수 a가 b보다 작다");
		}
		
	}

}
