package java01;

import java.util.Scanner;

public class LowestDigit {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값: ");
		int x = stdIn.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값은" + (x/10) + "이다.");
		System.out.println("마지막 자릿수는" + (x%10) + "이다.");
		
		
	}

}
