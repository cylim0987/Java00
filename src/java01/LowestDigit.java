package java01;

import java.util.Scanner;

public class LowestDigit {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������: ");
		int x = stdIn.nextInt();
		
		System.out.println("������ �ڸ����� ������ ����" + (x/10) + "�̴�.");
		System.out.println("������ �ڸ�����" + (x%10) + "�̴�.");
		
		
	}

}
