package java03;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int x = stdIn.nextInt();
		
		if(x >= 0) { 
			System.out.println("절대값은 " + x + "이다. ");
		}
		else {
			System.out.println("절대값은 " + -x + "이다. ");
		}
	}

}
