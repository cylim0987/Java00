package java03;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int x = stdIn.nextInt();
		
		if(x < 0 || x > 100) {
			System.out.println("�߸��� ������.");
		}
		else if(x <= 49) {
			System.out.println("��");
		}
		else if(x <= 59) {
			System.out.println("��");
		}
		else if(x <= 69) {
			System.out.println("��");
		}
		else if(x <= 79) {
			System.out.println("��");
		}
		else {
			System.out.println("��");
		}
	}

}
