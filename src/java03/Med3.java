package java03;

import java.util.Scanner;

public class Med3 {
//�߾Ӱ� ���ϴ� �� ��Ƴ�
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ a : ");
		int a = stdIn.nextInt();
		
		System.out.println("������ b : ");
		int b = stdIn.nextInt();
		
		System.out.println("������ c : ");
		int c = stdIn.nextInt();
		
		
		int med;
		if(a >= b) {
			if(b >= c) {
				med = b;
			}
			else if (a <= c) {
				med = a;
			}
			else {
				med = c;
			}
		}
		else if(a > c) {
			med = a;
		}
		else if(b > c) {
			med = c;
		}
		else {
			med = b;
		}
		System.out.println("�߾Ӱ��� " + med + "");
	}

}
