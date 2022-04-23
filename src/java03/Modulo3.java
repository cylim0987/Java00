package java03;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수값: ");
		int x = stdIn.nextInt();

		if (x > 0) {
			if (x % 3 == 0) {
				System.out.println(x + "값은 3으로 나누어집니다.");
			} else if (x % 3 == 1) {
				System.out.println(x + "값은 3으로 나누어지지 않고 나머지는 1이다.");
			} else if (x % 3 == 2) {
				System.out.println(x + "값은 3으로 나누어지지 않고 나머지는 2이다.");
			}

		} else if (x == 0) {
			System.out.println("변수를 0으로 입력했다");
		} else {
			System.out.println("변수가 음수다");
		}
	}
}
