package java03;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� A :");
		int a = stdIn.nextInt();

		System.out.print("���� B :");
		int b = stdIn.nextInt();
		
		if (a % b == 0) {
			System.out.println("B�� A�� ����̴�.");
		}
		else {
			System.out.println("B�� A�� ����� �ƴϴ�.");
		}
	}

}
