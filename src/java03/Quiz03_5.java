package java03;

import java.util.Scanner;

public class Quiz03_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		int x = stdIn.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int y = stdIn.nextInt();
		
		System.out.println("x�� y �� ���� ���� " + (x<y ? x:y));
		System.out.println("x�� y �� ū ���� " + (x>y ? x:y ));
		
		
	}

}
