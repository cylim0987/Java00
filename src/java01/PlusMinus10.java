package java01;

import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt(); //x�� �Է¹��� �������� ����.
		int y = 10;
		
		System.out.println("������: " + x);
		System.out.println(y + "��/�� ���� ���� " + (x+y) + "�Դϴ�. ");
		System.out.println(y + "��/�� �� ���� " + (x-y) + "�Դϴ�. ");
		
	}

}
