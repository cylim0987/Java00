package java03;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int x = stdIn.nextInt();

		System.out.println("나눌 값 : ");
		int y = stdIn.nextInt();
		
		if(x%y == 0) {
			System.out.println(x + "값은 " + y + "로 나누어진다.");
		}else {
			System.out.println(x + "값은 " + y + "로 나누어지지 않는다.");
		}
			
		
	}

}
