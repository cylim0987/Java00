package java03;

import java.util.Scanner;

public class Diff2Digits1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a: ");
		int x = stdIn.nextInt();
		System.out.println("���� b: ");
		int y = stdIn.nextInt();
		
		int WW = x>=y ? x-y : y-x;
		
		if(WW <= 10) {
			System.out.println("�� ���� ���� 10����");
		}else if(WW >= 11) {
			System.out.println("�� ���� ���� 11�̻�");
		}
		
	}

}
