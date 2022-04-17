package java01;

import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt(); //x에 입력받은 정수값을 저장.
		int y = 10;
		
		System.out.println("정수값: " + x);
		System.out.println(y + "을/를 더한 값은 " + (x+y) + "입니다. ");
		System.out.println(y + "을/를 뺀 값은 " + (x-y) + "입니다. ");
		
	}

}
