package java03;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a :");
		int x = stdIn.nextInt();
		
		System.out.print("���� b :");
		int y = stdIn.nextInt();
		
		if(x > y) {
			System.out.println("���� a�� b���� ũ��");
		}else if(x == y) {
			System.out.println("���� a�� b�� ����");
		}else {
			System.out.println("���� a�� b���� �۴�");
		}
		
	}

}
