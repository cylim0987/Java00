package java03;

import java.util.Scanner;

public class Diff2A_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int x = stdIn.nextInt();
		
		System.out.println("���� b : ");
		int y = stdIn.nextInt();
		
		int diff;
		
		if(x>y) {
			diff = x-y;
		}else if(x<y) {
			diff = y-x;
		}else {
			diff = 0;
		}
		System.out.println("�� ���� ����" + diff);
	}

}
