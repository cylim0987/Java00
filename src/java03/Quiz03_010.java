package java03;

import java.util.Scanner;

public class Quiz03_010 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�");
		int m = stdIn.nextInt();
		
		switch(m % 3) {
		case 0 : System.out.println("3���� ��������");
		break;
		case 1 : System.out.println("������ 1�� ����");
		break;
		case 2 : System.out.println("������ 2�� ����");
		break;
		
		
		}
		
	}

}
