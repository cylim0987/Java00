package java03;

import java.util.Scanner;

public class Diff2A_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int x = stdIn.nextInt();
		
		System.out.println("���� b : ");
		int y = stdIn.nextInt();
		
		int diff = x>=y ? x-y : y-x ;
		
		System.out.println("�� ���� ����" + diff );
	
	
	}

}
