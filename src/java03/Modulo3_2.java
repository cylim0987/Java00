package java03;

import java.util.Scanner;

public class Modulo3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수값: ");
		int x = stdIn.nextInt();
		System.out.println("나눌 값:");
		int y = stdIn.nextInt();

		if (x > 0) {
			if (x % y == 0) {
				System.out.println(x + "값은" + y + "으로 나누어지고 몫은" + (x/y) + "이다." );
			} else if (x % y != 0) {
				System.out.println(x + "값은" + y + "으로 나누어지지 않고 몫은" + (x/y) + "이며 나머지는" + (x%y) + "이다.");
			}
		} else if (x == 0) {
			System.out.println("x변수를 0으로 입력했다");
		} else {
			System.out.println("x변수가 음수다");
		}
		
	}

}
