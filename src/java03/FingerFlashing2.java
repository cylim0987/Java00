package java03;

import java.util.Random;

// 0, 1, 2 �� �ϳ��� ������ �����ؼ� 0�̸� '����', 1�̸� '����', 2�̸� '��'�� ǥ���ϴ� ���α׷��� �ۼ�.
public class FingerFlashing2 {
	public static void main(String[] args) {

		Random rand = new Random();
		
		System.out.print("��ǻ�Ͱ� �� �� : ");
		int x = rand.nextInt(3);

		switch(x) {
		case 0: System.out.println("����"); break;
		case 1: System.out.println("����"); break;
		case 2: System.out.println("��"); break;
		
		}
		
		
		
		
		
	}

}
