package java03;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int x = stdIn.nextInt();

		System.out.println("���� �� : ");
		int y = stdIn.nextInt();
		
		if(x%y == 0) {
			System.out.println(x + "���� " + y + "�� ����������.");
		}else {
			System.out.println(x + "���� " + y + "�� ���������� �ʴ´�.");
		}
			
		
	}

}
