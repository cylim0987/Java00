package java03;

import java.util.Scanner;

public class Quiz03_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Է�");
		int w = stdIn.nextInt();
		
		switch(w) {
		case 0 : System.out.println("����");
			break;
		case 1 : System.out.println("��");
			break;
		case 2 : System.out.println("����");
			break;
		default : System.out.println("���Է��Ͻÿ�");
		}
		
	}

}
