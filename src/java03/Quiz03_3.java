package java03;

import java.util.Scanner;

public class Quiz03_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Է��Ͻÿ�");
		int x = stdIn.nextInt();

		
		System.out.println("���� x�� ���밪�� " + (x>=0 ? x : -x));
		
		
	}

}
