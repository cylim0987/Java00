package java03;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� �� �Դϱ�?");
		int x = stdIn.nextInt();
		
		switch(x) {
		case 3 :
		case 4 :
		case 5 : System.out.println("��");
			break;
		case 6 :
		case 7 :
		case 8 : System.out.println("����");
			break;
		case 9 :
		case 10 :
		case 11 : System.out.println("����");
			break;
		case 12 :
		case 1 :
		case 2 : System.out.println("�ܿ�");
			break;
		default : System.out.println("�߸� �Է��Ͽ���");
			break;
		}
	//default : � ���ǽĿ��� �ش����� �ʴ� ���
	//switch�� ���� ���̺� �������� �����ϸ� ���� ����� �޶����ϱ� ���̺� ���� �����ؾ���.
	}

}