package java01;

import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	final double PI = 3.1416;
		
	System.out.println("���� �ѳ��̿� ���Ǹ� ���մϴ�.");
	System.out.print("������ : ");
	double x = stdIn.nextDouble();
	
	System.out.println("�ѳ��̴� " + (4 * PI*x*x) + "�̴�.");
	System.out.println("���Ǵ� " + (4/3.0*PI*x*x*x) + "�̴�.");
	
		
	}

}
