package java03;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a: ");
		int a = stdIn.nextInt();
		
		System.out.println("���� b: ");
		int b = stdIn.nextInt();
		
		if(a>=b) {
			System.out.println("a>=b�� �ǵ��� �����Ͽ���.");
			System.out.println("���� a�� " + a + "�̴�");
			System.out.println("���� b�� " + b + "�̴�");
		}else if(a < b) {
			System.out.println("a<b�� �ǵ��� �����Ͽ���.");
			System.out.println("���� b�� " + b + "�̴�");
			System.out.println("���� a�� " + a + "�̴�");
		}
		
	}

}
